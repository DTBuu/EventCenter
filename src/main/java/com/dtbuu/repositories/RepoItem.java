/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Items;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoItem {
    List<Items> getItemses(String kw);
}
