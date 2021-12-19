/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Buu Duong Tan
 */
@Controller
//@RequestMapping("/signed")
public class ControllerHomeManager {

    @GetMapping("/HomeManager")
    public String pageHome(Model m) {

        return "pageHomeManager";
    }

    @RequestMapping("/admin/tab")
    public String pageManagement() {
        return "pageManagement";
    }

    @GetMapping("/admin/Dashboard")
    public String pageDashboard(Model m) {

        return "pageDashboard";
    }

    @GetMapping("/manageService")
    public String manageService() {
        return "manageService";
    }
}
