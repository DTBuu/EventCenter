/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.TrangTri;
import com.dtbuu.repositories.RepoTrangTri;
import com.dtbuu.services.SerTrangTri;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerTrangTri implements SerTrangTri {

    @Autowired
    private RepoTrangTri repoTrangTri;
    
    @Override
    public List<TrangTri> getTrangTris(String keyword,int page) {
        return this.repoTrangTri.getTrangTris(keyword,page);
    }
    
    @Override
    public TrangTri getTrangTriByID(int i) {
        return this.repoTrangTri.getTrangTriByID(i);
    }
    
    @Override
    public boolean addOrUpdate(TrangTri tt) {
        return this.repoTrangTri.addOrUpdate(tt);
    }
    
    @Override
    public boolean deleteTrangTri(int i) {
        return this.repoTrangTri.deleteTrangTri(i);
    }

    @Override
    public long countTrangTris() {
        return this.repoTrangTri.countTrangTris();
    }

    @Override
    public List<TrangTri> getTrangTris() {
        return this.repoTrangTri.getTrangTris();
    }
     
}
