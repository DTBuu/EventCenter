/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.KhachHang;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Buu Duong Tan
 */
@Service
public interface SerKhachHang {

    boolean addKhachHang_with_Login(KhachHang newCustome);

    List<KhachHang> getKhachHangs(String keyword, int page);

    long countKhachHangs();
}
