/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.Logins;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Buu Duong Tan
 */
public interface SerLogins extends UserDetailsService {
    boolean addLogin(Logins login);
    List<Logins> getLogins(String key);
}
