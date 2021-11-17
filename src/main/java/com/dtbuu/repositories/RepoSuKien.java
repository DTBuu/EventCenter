/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Sukien;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoSuKien {

    Sukien getSuKienbyID(int suKienid);

    boolean deleteSuKien(int suKienid);

    boolean addOrUpdateSuKien(Sukien suKien);

    List<Sukien> getSuKiens(String keyword);

}
