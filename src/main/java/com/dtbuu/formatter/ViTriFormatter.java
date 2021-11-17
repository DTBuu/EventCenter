/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.formatter;

import com.dtbuu.pojos.ViTri;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author DiepHoangPhi
 */
public class ViTriFormatter implements Formatter<ViTri>{
    
    @Override
    public String print(ViTri t, Locale locale) {
        return String.valueOf(t.getViTri_id());
    }

    @Override
    public ViTri parse(String viTri_id, Locale locale) throws ParseException {
        ViTri v=new ViTri();
        v.setViTri_id(Integer.parseInt(viTri_id));
        return v;
    }
    
}
