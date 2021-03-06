/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.Diadiemtochuc;
import com.dtbuu.pojos.ItemsInMenus;
import com.dtbuu.pojos.Menu;
import com.dtbuu.services.SerItem;
import com.dtbuu.services.SerMenu;
import com.dtbuu.services.SerSanhTiec;
import com.dtbuu.validators.WebAppValidator;
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
public class ControllerHallCRUD {

    @Autowired
    private SerSanhTiec serSanhTiec;
    @Autowired
    private SerMenu serMenu;
    @Autowired
    private SerItem serItem;

//    @Autowired
//    private WebAppValidator diadiemtochucValidator;
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.setValidator(diadiemtochucValidator);
//    } 
    @GetMapping("/crudHall")
    public String addOrUpdateView(Model model,
            @RequestParam(name = "DDTC_id", defaultValue = "0") int DDTC_id) {
        if (DDTC_id > 0) { // cập nhật
            model.addAttribute("crudHall", this.serSanhTiec.getSanhTiecbyID(DDTC_id));
        } else {
            // thêm
            model.addAttribute("crudHall", new Diadiemtochuc());
        }
        return "crudHall";
    }

    @PostMapping("/crudHall")
    public String addOrUpdate(Model model, @ModelAttribute(value = "crudHall") @Valid Diadiemtochuc diadiemtochuc, BindingResult result, SessionStatus sessionStatus) {
        if (result.hasErrors()) {
            return "crudHall";
        }
        if (!this.serSanhTiec.addOrUpdate(diadiemtochuc)) {
            model.addAttribute("errMsg", "Has something wrong. Please try again later");
            return "crudHall";
        }
        sessionStatus.setComplete();
        return "redirect:/manageHall";
    }

    @GetMapping("/crudMenu")
    public String addOrUpdateViewMenu(Model model,
            @RequestParam(name = "menuid", defaultValue = "0") int menuid) {
        // thêm
//       model.addAttribute("check", menuid);
        model.addAttribute("cate", this.serMenu.getMenus(""));

        if (menuid == 0) {

        } else {
            model.addAttribute("crudMenu", this.serMenu.getMenuByID(menuid));
            model.addAttribute("cate", this.serMenu.getMenus(""));
            model.addAttribute("cate1", this.serItem.getItemses(""));
        }
        model.addAttribute("crudMenu", new ItemsInMenus());
        return "crudMenu";
    }

    @PostMapping("/crudMenu")
    public String addOrUpdate(Model model, @ModelAttribute(value = "crudMenu") @Valid ItemsInMenus iim,
            BindingResult result, SessionStatus sessionStatus) {
        try {
            if (result.hasErrors()) {
                return "crudMenu";
            }
            if (!this.serMenu.save(iim)) {
                model.addAttribute("errMsg", "Has something wrong. Please try again later");
                return "crudMenu";
            }
        } catch (Exception ex) {
            System.err.println("=== PLEASE CHECK AGAIN INFOMATION ===" + ex.getMessage());
            ex.printStackTrace();
        }

        sessionStatus.setComplete();
        return "redirect:/manageMenu";
    }

}
