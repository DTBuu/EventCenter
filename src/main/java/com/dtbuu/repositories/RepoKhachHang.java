/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import java.util.List;

/**
 *
 * @author Buu Duong Tan
 */
public interface RepoKhachHang {

    boolean addKhachHang(KhachHang customer);

    List<KhachHang> getKhachHangs(String keyword, int page);

    List<KhachHang> findKhachHangByLoginID(String login_id);

    KhachHang getKhachHangByLoginID(int login_id);

    long countKhachHangs();
    
}
