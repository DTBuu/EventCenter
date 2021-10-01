/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Logins;
import java.util.List;

/**
 *
 * @author Buu Duong Tan
 */
public interface RepoLogins {
    boolean addLogin(Logins login);
    List<Logins> getLogins(String key);
}
