/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.NhanVien;
import com.dtbuu.repositories.RepoNhanVien;
import com.dtbuu.services.SerNhanVien;
import java.util.List;
import java.lang.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Buu Duong Tan
 */
@Repository
public class ImpSerNhanVien implements SerNhanVien {

    @Autowired
    private RepoNhanVien repoNhanVien;

    @Override
    public List<NhanVien> loadTableNhanVien(String kw) {
        return this.repoNhanVien.loadTableNhanVien(kw);
        
        
    }

    @Override
    public NhanVien getNhanVienByID(int NhanVien_id) {
        return this.repoNhanVien.getNhanVienbyID(NhanVien_id);
    }

    @Override
    public boolean addOrUpdateNhanVien(NhanVien nhanvien) {
        return this.repoNhanVien.addOrUpdateNhanVien(nhanvien);
    }

    @Override
    public boolean deleteNhanVien(int nhanVien_id) {
        return this.repoNhanVien.deleteNhanVien(nhanVien_id);
    }
}
