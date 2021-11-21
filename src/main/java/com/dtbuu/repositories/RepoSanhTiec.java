/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Diadiemtochuc;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoSanhTiec {
    Diadiemtochuc getSanhTiecbyID(int DDTC_id);
    boolean deleteSanh(int DDTC_id);
    boolean addOrUpdateSanh(Diadiemtochuc sanh);
    List<Diadiemtochuc> getSanhTiecs(String keyword);
    List<Diadiemtochuc> getSanhTiecs(float fromPrice, float toPrice);
    //string kw
}
