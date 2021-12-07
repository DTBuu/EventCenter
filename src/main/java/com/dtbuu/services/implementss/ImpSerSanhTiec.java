/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.cloudinary.Cloudinary;
import com.dtbuu.pojos.Diadiemtochuc;
import com.dtbuu.repositories.RepoSanhTiec;
import com.dtbuu.services.SerSanhTiec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerSanhTiec implements SerSanhTiec {
    
    @Autowired
    private RepoSanhTiec repoSanhTiec;
    @Autowired
    private Cloudinary cloudinary;
            
    @Override
    public List<Diadiemtochuc> getSanhTiecs(String keyword, int page) {
        return this.repoSanhTiec.getSanhTiecs(keyword,page);
    }

    @Override
    public boolean addOrUpdate(Diadiemtochuc sanh) {
        return this.repoSanhTiec.addOrUpdateSanh(sanh);
    }
    

    @Override
    public Diadiemtochuc getSanhTiecbyID(int DDTC_id) {
        return this.repoSanhTiec.getSanhTiecbyID(DDTC_id);
    }

    @Override
    public boolean deleteSanh(int DDTC_id) {
        return this.repoSanhTiec.deleteSanh(DDTC_id);
    }

    @Override
    public long countSanhTiecs() {
        return this.repoSanhTiec.countSanhTiecs();
    }

    @Override
    public List<Diadiemtochuc> getSanhTiecs() {
        return this.repoSanhTiec.getSanhTiecs();
    }

    
}
