/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.ChuTri;
import com.dtbuu.repositories.RepoChuTri;
import com.dtbuu.services.SerChuTri;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerChuTri implements SerChuTri {
    @Autowired
    private RepoChuTri repoChuTri;
    
    @Override
    public List<ChuTri> getChuTris(String keyword) {
        return this.repoChuTri.getChuTri(keyword);
    }

    @Override
    public ChuTri getChuTriByID(int ChuTri_id) {
        return this.repoChuTri.getChuTriByID(ChuTri_id);
    }

    @Override
    public boolean addOrUpdate(ChuTri chuTri) {
        return this.repoChuTri.addOrUpdate(chuTri);
    }

    @Override
    public boolean deleteChuTri(int ChuTri_id) {
        return this.repoChuTri.deleteChuTri(ChuTri_id);
    }
    
}
