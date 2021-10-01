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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Buu Duong Tan
 */
@Service
public class ImpSerNhanVien implements SerNhanVien{
    
    @Autowired
    private RepoNhanVien repoNhanVien;

    @Override
    public List<NhanVien> loadTableNhanVien() {
        return this.repoNhanVien.loadTableNhanVien();
    }
}
