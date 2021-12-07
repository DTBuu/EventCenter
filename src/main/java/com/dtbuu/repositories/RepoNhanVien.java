/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.NhanVien;
import java.util.List;

/**
 *
 * @author Buu Duong Tan
 */
public interface RepoNhanVien {

    List<NhanVien> loadTableNhanVien(String kw, int page);

    NhanVien getNhanVienbyID(int NhanVien_id);

    boolean addOrUpdateNhanVien(NhanVien nhanvien);

    boolean deleteNhanVien(int nhanVien_id);

    long countNhanViens();
}
