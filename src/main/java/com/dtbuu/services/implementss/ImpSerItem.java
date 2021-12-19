/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.Items;
import com.dtbuu.repositories.RepoGiaiTri;
import com.dtbuu.repositories.RepoItem;
import com.dtbuu.services.SerItem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerItem implements SerItem {
    @Autowired
    private RepoItem repoItem;

    @Override
    public List<Items> getItemses(String kw) {
        return this.repoItem.getItemses(kw);
    }

    
}
