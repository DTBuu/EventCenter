/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.Sukien;
import com.dtbuu.services.SerChuTri;
import com.dtbuu.services.SerGiaiTri;
import com.dtbuu.services.SerMenu;
import com.dtbuu.services.SerPhucVu;
import com.dtbuu.services.SerSanhTiec;
import com.dtbuu.services.SerSuKien;
import com.dtbuu.services.SerTrangTri;
import java.util.Date;
import javax.servlet.http.HttpSession;
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
public class ControllerBookingEvent {

    @Autowired
    private SerSuKien serSuKien;
    @Autowired
    private SerSanhTiec serSanhTiec;
    @Autowired
    private SerMenu serMenu;
    @Autowired
    private SerGiaiTri serGiaiTri;
    @Autowired
    private SerChuTri serChuTri;
    @Autowired
    private SerTrangTri serTrangTri;
    @Autowired
    private SerPhucVu serPhucVu;

    @ModelAttribute
    public void commonAttr(Model modelcate, HttpSession session) {
        modelcate.addAttribute("sanh", this.serSanhTiec.getSanhTiecs(""));
        modelcate.addAttribute("menu", this.serMenu.getMenus(""));
        modelcate.addAttribute("giaitri", this.serGiaiTri.getGiaiTris(""));
        modelcate.addAttribute("chutri", this.serChuTri.getChuTris(""));
        modelcate.addAttribute("phucvu", this.serPhucVu.getPhucVus(""));
        modelcate.addAttribute("trangtri", this.serTrangTri.getTrangTris(""));
    }

    @GetMapping("/bookingEvent")
    public String pageBooking(Model model, @RequestParam(name = "suKienid", defaultValue = "0") int suKienid) {
//        model.addAttribute("bookingEvent", new Sukien());
        if (suKienid > 0) { // cập nhật
            model.addAttribute("bookingEvent", this.serSuKien.getSuKienbyID(suKienid));
        } else {
            model.addAttribute("bookingEvent", new Sukien());
        }
        model.addAttribute("valueController", "aaa");
        return "bookingEvent";
    }

//    @PostMapping("/bookingEvent")
//    public String addSuKien(Model model, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date,
//            @ModelAttribute(value = "bookingEvent") @Valid Sukien sukien, SessionStatus sessionStatus,
//                        @RequestParam(name = "suKienten") String suKienten,
//            BindingResult bindingResult) {
////
////        if (bindingResult.hasErrors()) {
////            return "bookingEvent";
////        }
////        if (! this.serSuKien.addOrUpdateSuKien(sukien)) {
////            model.addAttribute("errMsg", "Has something wrong. Please try again later");
////            return "bookingEvent";
////        }
//
////        model.addAttribute("bookingEvent", this.serSuKien.addOrUpdateSuKien(sukien));
//        model.addAttribute("bookingEvent", sukien);
//        model.addAttribute("valueController", "aaa");
////        return "redirect:/";
//        return "payment";
//    }
    @PostMapping("/bookingEvent")
    public String addSukien(Model model,@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date,
            Sukien sukien,HttpSession session) {
//        model.addAttribute("bookingEvent", this.serSuKien.addOrUpdateSuKien(sukien));
//        model.addAttribute("bookingEvent", session);
        session.setAttribute("bookingEvent", sukien);
        return "redirect:/payment";
    }

        @GetMapping("/payment")
    public String detailView(Model model,HttpSession session,Sukien sukien){
        model.addAttribute("value", "asdfdsaf");
        session.setAttribute("bookingEvent", sukien);
        
        return "payment";
    }
}