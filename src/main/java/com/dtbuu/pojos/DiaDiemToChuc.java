/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DiepHoangPhi
 */
@Entity
@Table(name = "diadiemtochuc")
public class Diadiemtochuc implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DDTC_id;
    
    @Column(nullable = false,length = 100)
    @NotNull 
    @Size(max = 100,min = 5, message = "{diadiemtochuc.DDTC_ten.lenErr}")
    private String DDTC_ten;

    @Column(nullable = false)
    @Min(value = 100, message ="{diadiemtochuc.DDTC_SoBanMax.tableMin}" )
    private int DDTC_SoBanMax;
    
    @Column(nullable = false)
    @Max(value  = 10000000, message = "{diadiemtochuc.DDTC_GiaMotBan.lenErr}")
    private float DDTC_GiaMotBan;

    @Column(name = "ghiChu" ,nullable = true,length = 100)
    private String DDTC_GhiChu;

    public int getDDTC_id() {return DDTC_id;} 
    public void setDDTC_id(int DDTC_id) { this.DDTC_id = DDTC_id;}

    public String getDDTC_ten() {return DDTC_ten;}
    public void setDDTC_ten(String DDTC_ten){this.DDTC_ten = DDTC_ten;}

    public int getDDTC_SoBanMax() {return DDTC_SoBanMax;}
    public void setDDTC_SoBanMax(int DDTC_SoBanMax) {this.DDTC_SoBanMax = DDTC_SoBanMax;}

    public float getDDTC_GiaMotBan() {return DDTC_GiaMotBan;}
    public void setDDTC_GiaMotBan(float DDTC_GiaMotBan) {this.DDTC_GiaMotBan = DDTC_GiaMotBan;}
    
    public String getDDTC_GhiChu() {return DDTC_GhiChu;}
    public void setDDTC_GhiChu(String DDTC_GhiChu) {this.DDTC_GhiChu = DDTC_GhiChu;}
    
}


