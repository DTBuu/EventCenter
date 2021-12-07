/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.TrangTri;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoTrangTri {

    List<TrangTri> getTrangTris(String keyword,int page);
    
    List<TrangTri> getTrangTris();

    TrangTri getTrangTriByID(int TrangTri_id);

    boolean addOrUpdate(TrangTri trangTri);

    boolean deleteTrangTri(int TrangTri_id);
    
    long countTrangTris();
}
