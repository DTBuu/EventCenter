/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import com.dtbuu.services.SerKhachHang;
import com.dtbuu.services.SerLogins;
import com.dtbuu.services.SerNhanVien;
import com.dtbuu.services.SerSanhTiec;
import com.dtbuu.validators.myValidators;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.dtbuu.services.SerViTri;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Buu Duong Tan
 */
@Controller
@ControllerAdvice
public class ControllerHome {

    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
            + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
            + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");

    @Autowired
    private SerViTri serViTri;
    @Autowired
    private SerLogins serLogins;
    @Autowired
    private SerNhanVien serNhanVien;
    @Autowired
    private SerLogins userDetailsService;
    @Autowired
    private SerKhachHang serKhachHang;
    @Autowired
    private SerSanhTiec serSanhTiec;

    @ModelAttribute
    public void sharedAttributes(Model m, HttpSession session) {
        m.addAttribute("currentUser", session.getAttribute("currentUser"));
    }

    @GetMapping("/")
    public String pageHome(Model m) {

        return "pageHome";
    }

    @GetMapping("/sign-in")
    public String pageSignIn() {

        return "pageSignIn";
    }

    @GetMapping("/sign-up") // Send empty object to outside.
    public String pageSignUp(Model m) {

        m.addAttribute("newLogin", new Logins());
        m.addAttribute("newCustomer", new KhachHang());

        return "pageSignUp";
    }

    @PostMapping("/sign-up")
    public String register(Model m,
            @ModelAttribute(value = "newLogin") Logins newLogin,
            @ModelAttribute(value = "newCustomer") KhachHang newCustomer
    ) {

        List<Logins> existedLogins = this.userDetailsService.getLogins(newLogin.getLogin_user().trim());
        String errMess = myValidators.validateSignUpForm(existedLogins, newLogin);

        if (errMess == "") {
            if (this.userDetailsService.addLogin(newLogin)) {
                newCustomer.setLogin(this.serLogins.getLogins(newLogin.getLogin_user().trim()).get(0));
                newCustomer.setHo(newLogin.getTempHo().trim());
                newCustomer.setTen(newLogin.getTempTen().trim());
                newCustomer.setNgaySinh(newLogin.getTempNgaySinh().trim());
                newCustomer.setQueQuan(newLogin.getTempQueQuan().trim());
                newCustomer.setSdt(newLogin.getTempSdt().trim());
                newCustomer.setEmail(newLogin.getTempEmail().trim());

                this.serKhachHang.addKhachHang_with_Login(newCustomer);

                return "redirect:/";
            } else {
                errMess = "SOMETHING ELSE CRASHED DOWN HERE !!!";
            }
        }

        m.addAttribute("errMess", errMess);
        return "pageSignUp";
    }

    @GetMapping("/pageEvent")
    public String pageView(Model m, @RequestParam(value = "kw", required = false, defaultValue = "") String kw,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
        m.addAttribute("view", this.serSanhTiec.getSanhTiecs(kw, page));
        m.addAttribute("counter", this.serSanhTiec.countSanhTiecs());
        return "pageView";
    }

    @GetMapping("/pageAbout")
    public String pageAbout(Model m) {
        return "pageAbout";
    }

    @GetMapping("/pageContact")
    public String pageContact(Model m) {
        return "pageContact";
    }

}
