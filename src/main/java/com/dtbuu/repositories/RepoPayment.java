/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

/**
 *
 * @author DiepHoangPhi
 */
import com.dtbuu.pojos.Thanhtoan;

public interface RepoPayment {
    boolean save(Thanhtoan payment);
}
