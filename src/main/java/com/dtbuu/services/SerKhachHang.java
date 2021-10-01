/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;


/**
 *
 * @author Buu Duong Tan
 */
public interface SerKhachHang {
    boolean addKhachHang_with_Login(KhachHang newCustome);
}
