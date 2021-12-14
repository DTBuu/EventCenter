/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.Sukien;
import com.dtbuu.repositories.RepoSuKien;
import com.dtbuu.services.SerSuKien;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerSuKien implements SerSuKien {
    
    @Autowired
    private RepoSuKien repoSuKien;

    @Override
    public Sukien getSuKienbyID(int suKienid) {
        return  this.repoSuKien.getSuKienbyID(suKienid);
    }

    @Override
    public boolean deleteSuKien(int suKienid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addOrUpdateSuKien(Sukien suKien) {
        return this.repoSuKien.addOrUpdateSuKien(suKien);
    }

    @Override
    public Sukien save(Sukien sukien) {
        boolean isSuccess = repoSuKien.addOrUpdateSuKien(sukien);
        if(isSuccess){
            return repoSuKien.getSuKienbyID(sukien.getSuKienid());
        }
        return null;
    }

    @Override
    public List<Sukien> getSuKiens(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
