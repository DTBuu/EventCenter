/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.formatter;

import com.dtbuu.pojos.Logins;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author DiepHoangPhi
 */
public class LoginFormatter implements Formatter<Logins>{
    
    @Override
    public String print(Logins t, Locale locale) {
        return String.valueOf(t.getLogin_id());
    }

    @Override
    public Logins parse(String login_id, Locale locale) throws ParseException {
        Logins l=new  Logins();
        l.setLogin_id(Integer.parseInt(login_id));
        return l;
    }
    
}
