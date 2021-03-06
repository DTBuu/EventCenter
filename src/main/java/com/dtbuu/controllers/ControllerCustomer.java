/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.services.SerKhachHang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author DiepHoangPhi
 */
@Controller
//@RequestMapping("/admin")
public class ControllerCustomer {

    @Autowired
    private SerKhachHang serKhachHang;

    @GetMapping("/manageCustomer")
    public String manageCustomer(Model model,@RequestParam(value = "kw", required = false, defaultValue = "") String kw,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
//        List<KhachHang> list = this.serKhachHang.loadTableNhanVien("");
        model.addAttribute("khachhang", this.serKhachHang.getKhachHangs(kw,page));
        model.addAttribute("counter", this.serKhachHang.countKhachHangs());
        return "manageCustomer";
    }
}
