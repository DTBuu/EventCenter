/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.validators;

import com.dtbuu.pojos.Logins;
import com.dtbuu.services.SerLogins;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Buu Duong Tan
 */
public class myValidators {
    
    public static final Pattern DATE_PATTERN = Pattern.compile(
        "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"+
        "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"+
        "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"+
        "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
    
    @Autowired private SerLogins userDetailsService;
    
    public static String validateSignUpForm(List<Logins> existedLogins, Logins newLogin) {
        
        
        
        
        
        String errMess = "";
        
        String ho = newLogin.getTempHo().trim();
        String ten = newLogin.getTempTen().trim();
        // ViTri cua NhanVien HERE !!!
        String ngaySinh = newLogin.getTempNgaySinh().trim();
        String queQuan = newLogin.getTempQueQuan().trim();
        String sdt = newLogin.getTempSdt().trim();
        String email = newLogin.getTempEmail().trim();
        
        if(ho=="" || ten=="" || ngaySinh=="" || queQuan=="" || sdt=="" || email=="") {
            errMess = "Please, fill up all information !\n";
        }
        else if(DATE_PATTERN.matcher(ngaySinh).matches()==false) {
            errMess = "Date format must be yyyy-mm-dd !\n";
        }
        else if(sdt.length() != 10 || StringUtils.isNumeric(sdt)==false) {
            errMess = "Please, check your phone number !\n";
        }
        else if(EMAIL_PATTERN.matcher(email).matches()==false) {
            errMess = "Please, check your email !\n";
        }
        else if(existedLogins.size() != 0) {
            errMess = "Username already existed !\n";
        }
        else if(newLogin.getLogin_pass().equals(newLogin.getConfirmPass())==false) {
            errMess = "Passwords does not match !";
        }
        
        return errMess;
    }
}
