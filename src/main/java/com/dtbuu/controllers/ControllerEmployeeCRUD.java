/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.NhanVien;
import com.dtbuu.services.SerNhanVien;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author DiepHoangPhi
 */
@Controller
public class ControllerEmployeeCRUD {

    @Autowired
    private SerNhanVien serNhanVien;

//    @Autowired
//    private WebAppValidator diadiemtochucValidator;
//    
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(diadiemtochucValidator);
//    }
    @GetMapping("/crudEmployee")
    public String addOrUpdateView(Model model,
            @RequestParam(name = "NhanVien_id", defaultValue = "0") int NhanVien_id) {
        if (NhanVien_id > 0) { // cập nhật
            model.addAttribute("crudEmployee", this.serNhanVien.getNhanVienByID(NhanVien_id));
        } else {
            // thêm
            model.addAttribute("crudEmployee", new NhanVien());
        }
        return "crudEmployee";
    }
//@Valid BindingResult result,

    @PostMapping("/crudEmployee")
    public String addOrUpdate(Model model, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date,@ModelAttribute(value = "crudEmployee") @Valid NhanVien nhanvien,BindingResult result, SessionStatus sessionStatus) {
        model.addAttribute("crudEmployee", nhanvien);
        if (result.hasErrors()) {
            return "crudEmployee";
        }
        if (!this.serNhanVien.addOrUpdateNhanVien(nhanvien)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudEmployee";
        }
        sessionStatus.setComplete();
        return "redirect:/manageEmployee";
        
    }

}
