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
@Table(name="ChuTri")
public class ChuTri implements Serializable {
    
    @Id
    private int ChuTri_id;
    
    @Column(nullable=false, length=100)
    private String ChuTri_ten;
    
    @Column(nullable=false)
    private float ChuTri_gia;
    
    @Column(length=100)
    private String GhiChu;


    public int getChuTri_id() {return ChuTri_id;}
    public void setChuTri_id(int ChuTri_id) {this.ChuTri_id = ChuTri_id;}

    public String getChuTri_ten() {return ChuTri_ten;}
    public void setChuTri_ten(String ChuTri_ten) {this.ChuTri_ten = ChuTri_ten;}

    public float getChuTri_gia() {return ChuTri_gia;}
    public void setChuTri_gia(float ChuTri_gia) {this.ChuTri_gia = ChuTri_gia;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
