/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import com.dtbuu.pojos.Menu;
import com.dtbuu.services.SerMenu;
import com.dtbuu.services.SerSanhTiec;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
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
public class ControllerHall {
    @Autowired
    private SerSanhTiec serSanhTiec;
    @Autowired
    private SerMenu serMenu;

     @ModelAttribute
    public void commonAttr(Model model, HttpSession session){
        model.addAttribute("menu", this.serMenu.getMenus(""));
    }
    
    @GetMapping("/manageHall")
    public String manageHall(Model model) {
//        List<Menu> list = this.serMenu.getMenus("");
        model.addAttribute("sanhtiec", this.serSanhTiec.getSanhTiecs(""));
        return "manageHall";
    }
    
    @GetMapping("/manageMenu")
    public String manageMenu(Model model) {
//        List<Menu> list = this.serMenu.getMenus("");
        model.addAttribute("menus",this.serMenu.getItemsInMenus(""));
        model.addAttribute("m",this.serMenu.getMenus(""));
        return "manageMenu";
    }

    @DeleteMapping("manageHall/{DDTC_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteSanh(@PathVariable(name = "DDTC_id") int DDTC_id) {
        this.serSanhTiec.deleteSanh(DDTC_id);
    }
}
