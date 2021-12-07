/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.PhucVu;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoPhucVu {

    List<PhucVu> getPhucVus(String keyword,int page);
    
    List<PhucVu> getPhucVus();

    PhucVu getPhucVuByID(int PhucVu_id);

    boolean addOrUpdate(PhucVu phucVu);

    boolean deletePhucVu(int PhucVu_id);
    
    long countPhucVus();
}
