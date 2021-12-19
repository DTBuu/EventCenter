/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.validators;

import com.dtbuu.pojos.Diadiemtochuc;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author DiepHoangPhi
 */
@Component
public class HallNameValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Diadiemtochuc.class.isAssignableFrom(clazz);
    }

    
    
    
    @Override
    public void validate(Object o, Errors errors) {
        Diadiemtochuc d = (Diadiemtochuc) o;      
        if (!d.getDDTC_ten().contains("Sanh")) {
            errors.rejectValue("DDTC_ten", "diadiemtochuc.DDTC_ten.tenErr");
        }
    }
}