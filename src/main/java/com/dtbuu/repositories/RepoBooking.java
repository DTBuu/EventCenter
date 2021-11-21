/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Cart;
import java.util.Map;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoBooking {
        boolean addSuKien(Map<Integer ,Cart> cart);
}
