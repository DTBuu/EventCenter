/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.Sukien;
import com.dtbuu.pojos.Thanhtoan;
import com.dtbuu.repositories.RepoBooking;
import com.dtbuu.services.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @Autowired
    private SerPayment servicePayment;

    @Autowired
    private SerBooking serviceBooking;

    @ModelAttribute
    public void commonAttr(Model modelcate, HttpSession session) {
        modelcate.addAttribute("sanh", this.serSanhTiec.getSanhTiecs());
        modelcate.addAttribute("menu", this.serMenu.getMenus());
        modelcate.addAttribute("giaitri", this.serGiaiTri.getGiaiTris());
        modelcate.addAttribute("chutri", this.serChuTri.getChuTris());
        modelcate.addAttribute("phucvu", this.serPhucVu.getPhucVus());
        modelcate.addAttribute("trangtri", this.serTrangTri.getTrangTris());
    }

    @GetMapping("/bookingEvent")
    public String pageBooking(Model model,
            @RequestParam(name = "suKienid", defaultValue = "0") int suKienid) {
        if (suKienid == 0) {
            model.addAttribute("bookingEvent", new Sukien());
        }

        model.addAttribute("valueController", "aaa");
        return "bookingEvent";
    }

    @PostMapping("/bookingEvent")
    public String addSukien(
            @RequestParam(name = "suKienten") String tenSukien,
            @RequestParam(name = "suKienloai") String loaiSukien,
            @RequestParam(name = "ngayBatDau") String dateStart,
            @RequestParam(name = "ngayKetThuc") String dateEnd,
            @RequestParam(name = "ddtcId") String ddtcId,
            @RequestParam(name = "menuid") String menuid,
            @RequestParam(name = "chuTriid") String chuTriid,
            @RequestParam(name = "giaTriid") String giaTriid,
            @RequestParam(name = "trangTriid") String trangTriid,
            @RequestParam(name = "trangTriid") String phucVuid,
            @RequestParam(name = "soBan") String soBan
    ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm-dd-yyyy");
        Sukien sukien = new Sukien();
        sukien.setMenuid(serMenu.getMenuByID(Integer.valueOf(menuid)));
        sukien.setSuKienten(tenSukien);
        sukien.setSuKienloai(loaiSukien);
        try {
            sukien.setNgayBatDau(simpleDateFormat.parse(dateStart));
            sukien.setNgayKetThuc(simpleDateFormat.parse(dateEnd));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sukien.setdDTCid(serSanhTiec.getSanhTiecbyID(Integer.valueOf(ddtcId)));
        sukien.setChuTriid(serChuTri.getChuTriByID(Integer.valueOf(chuTriid)));
        sukien.setGiaiTriid(serGiaiTri.getGiaiTriByID(Integer.valueOf(giaTriid)));
        sukien.setTrangTriid(serTrangTri.getTrangTriByID(Integer.valueOf(trangTriid)));
        sukien.setPhucVuid(serPhucVu.getPhucVuByID(Integer.valueOf(phucVuid)));
        sukien.setSoBan(Integer.valueOf(soBan));
        Sukien event = serSuKien.save(sukien);
        System.out.println(event);
        return "redirect:/payment/id/" + sukien.getSuKienid();
    }

    @GetMapping("/payment/id/{id}")
    public ModelAndView detailView(@PathVariable(name = "id") Integer suKienId, HttpServletRequest request) {
        Sukien sukien = serviceBooking.findById(suKienId);
        System.out.println(sukien.getdDTCid());
        System.out.println(sukien.getSuKienid() + " " + sukien.getSuKienten());
        ModelAndView modelAndView = new ModelAndView("payment");
        modelAndView.addObject("event", sukien);
        return modelAndView;
    }

    @PostMapping("/payment/id/{id}")
    public String payment(@PathVariable(name = "id") Integer suKienId) {
        System.out.println("OK");
        Sukien sukien = serviceBooking.findById(suKienId);
        Thanhtoan thanhtoan = new Thanhtoan();
        thanhtoan.setNgayThanhToan(new Date());
        thanhtoan.setPhuongThuc("tien mat");
        thanhtoan.setSuKienid(sukien);
        thanhtoan.setSoTien(sukien.getTotalFee());
        servicePayment.save(thanhtoan);
        return "redirect:/HomeManager";
    }

}
