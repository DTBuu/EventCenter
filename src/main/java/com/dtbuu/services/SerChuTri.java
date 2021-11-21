/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.ChuTri;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerChuTri {

    List<ChuTri> getChuTris(String keyword);

    ChuTri getChuTriByID(int ChuTri_id);

    boolean addOrUpdate(ChuTri chuTri);

    boolean deleteChuTri(int ChuTri_id);
}
