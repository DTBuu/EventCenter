/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.PhucVu;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerPhucVu {

    List<PhucVu> getPhucVus(String keyword);

    PhucVu getPhucVuByID(int PhucVu_id);

    boolean addOrUpdate(PhucVu phucVu);

    boolean deletePhucVu(int PhucVu_id);
}
