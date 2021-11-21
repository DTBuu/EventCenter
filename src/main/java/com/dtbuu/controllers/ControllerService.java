/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.services.SerChuTri;
import com.dtbuu.services.SerGiaiTri;
import com.dtbuu.services.SerPhucVu;
import com.dtbuu.services.SerTrangTri;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author DiepHoangPhi
 */
@Controller
public class ControllerService {

    @Autowired
    private SerChuTri serChuTri;
    @Autowired
    private SerGiaiTri serGiaiTri;
    @Autowired
    private SerTrangTri serTrangTri;
    @Autowired
    private SerPhucVu serPhucVu;

//    @ModelAttribute
//    public void commonAttr(Model model, HttpSession session) {
//        model.addAttribute("giaitri", this.serGiaiTri.getGiaiTris(""));
//    }

    //Xóa chủ trì
    @GetMapping("/manageHost")
    public String manageHost(Model model) {
        model.addAttribute("chutri", this.serChuTri.getChuTris(""));
        return "manageHost";
    }

    @DeleteMapping("manageHost/{ChuTri_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteChuTri(@PathVariable(name = "ChuTri_id") int ChuTri_id) {
        this.serChuTri.deleteChuTri(ChuTri_id);
    }

    ///Xóa giải trí
    @GetMapping("/manageEnt")
    public String manageEnt(Model model) {
        model.addAttribute("giaitri", this.serGiaiTri.getGiaiTris(""));
        return "manageEnt";
    }

    @DeleteMapping("manageEnt/{GiaiTri_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteGiaiTri(@PathVariable(name = "GiaiTri_id") int GiaiTri_id) {
        this.serGiaiTri.deleteGiaiTri(GiaiTri_id);
    }

    //Xóa trang trí
    @GetMapping("/manageDecor")
    public String manageDecor(Model model) {
        model.addAttribute("trangtri", this.serTrangTri.getTrangTris(""));
        return "manageDecor";
    }

    @DeleteMapping("manageDecor/{TrangTri_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTrangTri(@PathVariable(name = "TrangTri_id") int TrangTri_id) {
        this.serTrangTri.deleteTrangTri(TrangTri_id);
    }

    //Xoa phuc vu
    @GetMapping("/manageServe")
    public String manageServe(Model model) {
        model.addAttribute("phucvu", this.serPhucVu.getPhucVus(""));
        return "manageServe";
    }

    @DeleteMapping("manageServe/{PhucVu_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePhucVu(@PathVariable(name = "PhucVu_id") int PhucVu_id) {
        this.serPhucVu.deletePhucVu(PhucVu_id);
    }
}
