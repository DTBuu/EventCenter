/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.PhucVu;
import com.dtbuu.repositories.RepoPhucVu;
import com.dtbuu.services.SerPhucVu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerPhucVu implements SerPhucVu {
    @Autowired
    private RepoPhucVu repoPhucVu;
    
    @Override
    public List<PhucVu> getPhucVus(String keyword,int page) {
        return this.repoPhucVu.getPhucVus(keyword,page);
    }

    @Override
    public PhucVu getPhucVuByID(int i) {
        return this.repoPhucVu.getPhucVuByID(i);
    }

    @Override
    public boolean addOrUpdate(PhucVu phucvu) {
        return this.repoPhucVu.addOrUpdate(phucvu);
    }

    @Override
    public boolean deletePhucVu(int i) {
        return this.repoPhucVu.deletePhucVu(i);
    }

    @Override
    public long countPhucVus() {
        return this.repoPhucVu.countPhucVus();
    }

    @Override
    public List<PhucVu> getPhucVus() {
        return this.repoPhucVu.getPhucVus();
    }
    
}
