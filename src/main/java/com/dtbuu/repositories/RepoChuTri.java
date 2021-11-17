/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.ChuTri;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoChuTri {

    List<ChuTri> getChuTri(String keyword);

    ChuTri getChuTriByID(int ChuTri_id);

    boolean addOrUpdate(ChuTri chuTri);

    boolean deleteChuTri(int ChuTri_id);
}
