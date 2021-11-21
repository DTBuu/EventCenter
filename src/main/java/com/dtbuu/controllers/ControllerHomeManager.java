/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Buu Duong Tan
 */
@Controller
public class ControllerHomeManager {

    @GetMapping("/HomeManager")
    public String pageHome(Model m) {

        return "pageHomeManager";
    }

    @GetMapping("/tab")
    public String pageManagement() {
        return "pageManagement";
    }

    @GetMapping("/Dashboard")
    public String pageDashboard(Model m) {

        return "pageDashboard";
    }

    @GetMapping("/manageService")
    public String manageService() {
        return "manageService";
    }
}
