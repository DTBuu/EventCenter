/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import com.dtbuu.repositories.RepoLogins;
import com.dtbuu.services.SerLogins;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Buu Duong Tan
 */
@Service("userDetailsService")
public class ImpSerLogins implements SerLogins {
    
    @Autowired private RepoLogins repoLogins;
    @Autowired private BCryptPasswordEncoder passwordEncoder;
    @Autowired private Cloudinary cloudinary;

    @Override
    public boolean addLogin(Logins login) {
        try {
            String raw_pass = login.getLogin_pass();
            login.setLogin_pass(this.passwordEncoder.encode(raw_pass));
            login.setLogin_loai(Logins.GUEST);
            // SET AVATAR HERE !!!
            Map r = this.cloudinary.uploader().upload(login.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));
            login.setLogin_avatar((String) r.get("secure_url"));
            return this.repoLogins.addLogin(login);
        } catch (IOException ex) {
//            Logger.getLogger(ImpSerLogins.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Logins> getLogins(String key) {
        return this.repoLogins.getLogins(key);
    }

    @Override
    public UserDetails loadUserByUsername(String key) throws UsernameNotFoundException {
        
        List<Logins> logins = this.getLogins(key);
        
        if(logins.isEmpty()) {
            throw new UsernameNotFoundException("Unexisted login !!!");
        }
        Logins lg = logins.get(0);
        
        Set<GrantedAuthority> GranAuths = new HashSet<>();
        GranAuths.add(new SimpleGrantedAuthority(lg.getLogin_loai()));

        return new org.springframework.security.core.userdetails.User(lg.getLogin_user(), lg.getLogin_pass(), GranAuths);
    }

    @Override
    public Logins getLoginsAuth() {
        return this.repoLogins.getLoginsAuth();
    }
}
