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
import javax.validation.constraints.Size;

/**
 *
 * @author Buu Duong Tan
 */
@Entity
@Table(name="PhucVu")
public class PhucVu implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PhucVu_id;
    
    @Column(nullable=false, length=100)
    @Size(max = 100, min = 5, message = "{PhucVu.PhucVu_ten.lenErr}")
    private String PhucVu_ten;
    
    @Column(nullable=false)
//    @Max(value  = 1000000000)
    @Max(value = 10000000, message = "{PhucVu.PhucVu_gia.priceErr}")
    private float PhucVu_gia;
    
    @Column(length=100)
    private String GhiChu;

    
    public int getPhucVu_id() {return PhucVu_id;}
    public void setPhucVu_id(int PhucVu_id) {this.PhucVu_id = PhucVu_id;}

    public String getPhucVu_ten() {return PhucVu_ten;}
    public void setPhucVu_ten(String PhucVu_ten) {this.PhucVu_ten = PhucVu_ten;}

    public float getPhucVu_gia() {return PhucVu_gia;}
    public void setPhucVu_gia(float PhucVu_gia) {this.PhucVu_gia = PhucVu_gia;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
