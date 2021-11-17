/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.Sukien;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerSuKien {

    Sukien getSuKienbyID(int suKienid);

    boolean deleteSuKien(int suKienid);

    boolean addOrUpdateSuKien(Sukien suKien);

    List<Sukien> getSuKiens(String keyword);
}
