/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

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
            
    @Override
    public List<Diadiemtochuc> getSanhTiecs(String keyword) {
        return this.repoSanhTiec.getSanhTiecs(keyword);
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

    
}
