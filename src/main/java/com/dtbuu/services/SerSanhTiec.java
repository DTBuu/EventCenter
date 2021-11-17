/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.Diadiemtochuc;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerSanhTiec {

    List<Diadiemtochuc> getSanhTiecs(String keyword);

    boolean addOrUpdate(Diadiemtochuc sanh);

    boolean deleteSanh(int DDTC_id);

    Diadiemtochuc getSanhTiecbyID(int DDTC_id);

}
