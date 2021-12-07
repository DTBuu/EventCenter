/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.GiaiTri;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerGiaiTri {

    List<GiaiTri> getGiaiTris(String keyword,int page);
    
    List<GiaiTri> getGiaiTris();

    GiaiTri getGiaiTriByID(int GiaiTri_id);

    boolean addOrUpdate(GiaiTri giaiTri);

    boolean deleteGiaiTri(int GiaiTri_id);
    
    long countGiaiTris();
}
