/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.Sukien;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DiepHoangPhi
 */
@RestController
public class ControllerPaymentApi {
    @PostMapping("/payment")
    public String confirmPayment(Model model,HttpSession session,Sukien sukien){
        
        return "OK";
    }
}
