/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.ChuTri;
import com.dtbuu.pojos.GiaiTri;
import com.dtbuu.pojos.PhucVu;
import com.dtbuu.pojos.TrangTri;
import com.dtbuu.services.SerChuTri;
import com.dtbuu.services.SerGiaiTri;
import com.dtbuu.services.SerPhucVu;
import com.dtbuu.services.SerTrangTri;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ControllerServiceCRUD {

    @Autowired
    private SerChuTri serChuTri;
    @Autowired
    private SerGiaiTri serGiaiTri;
    @Autowired
    private SerTrangTri serTrangTri;
    @Autowired
    private SerPhucVu serPhucVu;
//    @Autowired
//    private WebAppValidator diadiemtochucValidator;
//    
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(diadiemtochucValidator);
//    }

    @GetMapping("/crudHost")
    public String addOrUpdateView(Model model,
            @RequestParam(name = "ChuTri_id", defaultValue = "0") int ChuTri_id) {
        if (ChuTri_id > 0) { // cập nhật
            model.addAttribute("crudHost", this.serChuTri.getChuTriByID(ChuTri_id));
        } else {
            // thêm
            model.addAttribute("crudHost", new ChuTri());
        }
        return "crudHost";
    }

    @PostMapping("/crudHost")
    public String addOrUpdateChuTri(Model model, @ModelAttribute(value = "crudHost") @Valid ChuTri chuTri, BindingResult result, SessionStatus sessionStatus) {
        model.addAttribute("crudHost", chuTri);
        if (result.hasErrors()) {
            return "crudHost";
        }
        if (!this.serChuTri.addOrUpdate(chuTri)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudHost";
        }
        sessionStatus.setComplete();
        return "redirect:/manageHost";
    }

    //Add new, update Trang tri
    @GetMapping("/crudDecor")
    public String addOrUpdateViewDecor(Model model,
            @RequestParam(name = "TrangTri_id", defaultValue = "0") int TrangTri_id) {
        if (TrangTri_id > 0) { // cập nhật
            model.addAttribute("crudDecor", this.serTrangTri.getTrangTriByID(TrangTri_id));
        } else {
            // thêm
            model.addAttribute("crudDecor", new TrangTri());
        }
        return "crudDecor";
    }

    @PostMapping("/crudDecor")
    public String addOrUpdateTrangTri(Model model, @ModelAttribute(value = "crudDecor") @Valid TrangTri trangTri, BindingResult result, SessionStatus sessionStatus) {
        if (result.hasErrors()) {
            return "crudDecor";
        }
        if (!this.serTrangTri.addOrUpdate(trangTri)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudDecor";
        }
        sessionStatus.setComplete();
        return "redirect:/manageDecor";
    }

    //Add new, update Giai tri
    @GetMapping("/crudEnt")
    public String addOrUpdateViewGiaiTri(Model model,
            @RequestParam(name = "GiaiTri_id", defaultValue = "0") int GiaiTri_id) {
        if (GiaiTri_id > 0) { // cập nhật
            model.addAttribute("crudEnt", this.serGiaiTri.getGiaiTriByID(GiaiTri_id));
        } else {
            // thêm
            model.addAttribute("crudEnt", new GiaiTri());
        }
        return "crudEnt";
    }

    @PostMapping("/crudEnt")
    public String addOrUpdateGiaiTri(Model model, @ModelAttribute(value = "crudEnt") @Valid GiaiTri giaiTri, BindingResult result, SessionStatus sessionStatus) {
        if (result.hasErrors()) {
            return "crudEnt";
        }
        if (!this.serGiaiTri.addOrUpdate(giaiTri)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudEnt";
        }
        sessionStatus.setComplete();
        return "redirect:/manageEnt";
    }
    
    //Add new, update phuc vu
    @GetMapping("/crudServe")
    public String addOrUpdateViewPhucVu(Model model,
            @RequestParam(name = "PhucVu_id", defaultValue = "0") int PhucVu_id) {
        if (PhucVu_id > 0) { // cập nhật
            model.addAttribute("crudServe", this.serPhucVu.getPhucVuByID(PhucVu_id));
        } else {
            // thêm
            model.addAttribute("crudServe", new PhucVu());
        }
        return "crudServe";
    }

    @PostMapping("/crudServe")
    public String addOrUpdatePhucVu(Model model, @ModelAttribute(value = "crudServe") @Valid PhucVu phucVu, BindingResult result, SessionStatus sessionStatus) {
        if (result.hasErrors()) {
            return "crudServe";
        }
        if (!this.serPhucVu.addOrUpdate(phucVu)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudServe";
        }
        sessionStatus.setComplete();
        return "redirect:/manageServe";
    }

}
