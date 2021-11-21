/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.NhanVien;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Buu Duong Tan
 */
@Service
public interface SerNhanVien {

    List<NhanVien> loadTableNhanVien(String kw);
    NhanVien getNhanVienByID(int NhanVien_id);
    boolean addOrUpdateNhanVien(NhanVien nhanvien);
    boolean deleteNhanVien(int nhanVien_id);
}
