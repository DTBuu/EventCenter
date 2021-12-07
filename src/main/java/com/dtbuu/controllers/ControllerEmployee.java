/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.controllers;
import com.dtbuu.pojos.NhanVien;
import com.dtbuu.services.SerLogins;
import com.dtbuu.services.SerNhanVien;
import com.dtbuu.services.SerViTri;
import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author DiepHoangPhi
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Controller
@ControllerAdvice
public class ControllerEmployee {
    @Autowired
    private  SerNhanVien serNhanVien;
    @Autowired
    private  SerLogins serLogins;
    @Autowired
    private SerViTri serViTri;
    
    @ModelAttribute
    public void commonAttr(Model model, HttpSession session){
        model.addAttribute("login", this.serLogins.getLogins(""));
        model.addAttribute("vitri", this.serViTri.loadTableViTri());
    }
    
    @GetMapping("/manageEmployee")
    public String manageEmployee(Model model,@RequestParam(value = "kw", required = false, defaultValue = "") String kw,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page) {
//        List<NhanVien> list=this.serNhanVien.loadTableNhanVien("");
        model.addAttribute("nhanvien", this.serNhanVien.loadTableNhanVien(kw,page));
        model.addAttribute("counter", this.serNhanVien.countNhanViens());
        return "manageEmployee";
    }
    
    @DeleteMapping("manageEmployee/{NhanVien_id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNhanVien(@PathVariable(name = "NhanVien_id") int NhanVien_id) {
        this.serNhanVien.deleteNhanVien(NhanVien_id);
    }

}
