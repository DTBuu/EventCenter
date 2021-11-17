/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import com.dtbuu.repositories.RepoKhachHang;
import com.dtbuu.repositories.RepoLogins;
import com.dtbuu.services.SerKhachHang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Buu Duong Tan
 */
@Service
public class ImpSerKhachHang implements SerKhachHang {
    
    @Autowired private RepoKhachHang repoKhachHang;
    @Autowired private RepoLogins repoLogins;

    @Override
    public boolean addKhachHang_with_Login(KhachHang newCustomer) {
        
        
        
        
        return this.repoKhachHang.addKhachHang(newCustomer);
    }

    @Override
    public List<KhachHang> getKhachHangs(String keyword) {
        return this.repoKhachHang.getKhachHangs(keyword);
    }
    
    
}
