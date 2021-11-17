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

/**
 *
 * @author Buu Duong Tan
 */
@Entity
@Table(name="GiaiTri")
public class GiaiTri implements Serializable {
    
    @Id
    private int GiaiTri_id;
    
//    @Column(nullable=false, length=100)
//    private String GiaiTri_loai;
    
    @Column(nullable=false, length=100)
    private String GiaiTri_ten;
    
    @Column(nullable=false)
    private float GiaiTri_gia;
    
    @Column(length=100)
    private String GhiChu;


    public int getGiaiTri_id() {return GiaiTri_id;}
    public void setGiaiTri_id(int GiaiTri_id) {this.GiaiTri_id = GiaiTri_id;}

//    public String getGiaiTri_loai() {return GiaiTri_loai;}
//    public void setGiaiTri_loai(String GiaiTri_loai) {this.GiaiTri_loai = GiaiTri_loai;}

    public String getGiaiTri_ten() {return GiaiTri_ten;}
    public void setGiaiTri_ten(String GiaiTri_ten) {this.GiaiTri_ten = GiaiTri_ten;}

    public float getGiaiTri_gia() {return GiaiTri_gia;}
    public void setGiaiTri_gia(float GiaiTri_gia) {this.GiaiTri_gia = GiaiTri_gia;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
