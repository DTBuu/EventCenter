/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.TrangTri;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerTrangTri {

    List<TrangTri> getTrangTris(String keyword);

    TrangTri getTrangTriByID(int TrangTri_id);

    boolean addOrUpdate(TrangTri trangTri);

    boolean deleteTrangTri(int TrangTri_id);
}
