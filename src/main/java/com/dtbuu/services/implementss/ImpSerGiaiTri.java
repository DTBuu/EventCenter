/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.GiaiTri;
import com.dtbuu.repositories.RepoGiaiTri;
import com.dtbuu.services.SerGiaiTri;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerGiaiTri implements SerGiaiTri {
    @Autowired
    private RepoGiaiTri repoGiaiTri;

    @Override
    public List<GiaiTri> getGiaiTris(String keyword) {
        return this.repoGiaiTri.getGiaiTris(keyword);
    }

    @Override
    public GiaiTri getGiaiTriByID(int i) {
        return this.repoGiaiTri.getGiaiTriByID(i);
    }

    @Override
    public boolean addOrUpdate(GiaiTri gt) {
        return this.repoGiaiTri.addOrUpdate(gt);
    }

    @Override
    public boolean deleteGiaiTri(int i) {
        return this.repoGiaiTri.deleteGiaiTri(i);
    }
}
