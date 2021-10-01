/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Buu Duong Tan
 */
@Entity
@Table(name="DiaDiemToChuc")
public class DiaDiemToChuc implements Serializable {
    
    @Id
    private int DDTC_id;
    
    @Column(nullable=false, length=100)
    private String DDTC_ten;
    
    @Column(nullable=false)
    private int SoBanMax;
    
    @Column(nullable=false)
    private float GiaMotBan;
    
    @Column(length=100)
    private String GhiChu;


    public int getDDTC_id() {return DDTC_id;}
    public void setDDTC_id(int DDTC_id) {this.DDTC_id = DDTC_id;}

    public String getDDTC_ten() {return DDTC_ten;}
    public void setDDTC_ten(String DDTC_ten) {this.DDTC_ten = DDTC_ten;}

    public int getSoBanMax() {return SoBanMax;}
    public void setSoBanMax(int SoBanMax) {this.SoBanMax = SoBanMax;}

    public float getGiaMotBan() {return GiaMotBan;}
    public void setGiaMotBan(float GiaMotBan) {this.GiaMotBan = GiaMotBan;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
