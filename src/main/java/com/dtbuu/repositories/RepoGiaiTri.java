/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.GiaiTri;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public interface RepoGiaiTri {

    List<GiaiTri> getGiaiTris(String keyword);

    GiaiTri getGiaiTriByID(int GiaiTri_id);

    boolean addOrUpdate(GiaiTri giaiTri);

    boolean deleteGiaiTri(int GiaiTri_id);
}
