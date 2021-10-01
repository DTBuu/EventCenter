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
@Table(name="TrangTri")
public class TrangTri implements Serializable {
    
    @Id
    private int TrangTri_id;
    
    @Column(nullable=false, length=100)
    private String TrangTri_ten;
    
    @Column(nullable=false)
    private float TrangTri_gia;
    
    @Column(length=100)
    private String GhiChu;


    public int getTrangTri_id() {return TrangTri_id;}
    public void setTrangTri_id(int TrangTri_id) {this.TrangTri_id = TrangTri_id;}

    public String getTrangTri_ten() {return TrangTri_ten;}
    public void setTrangTri_ten(String TrangTri_ten) {this.TrangTri_ten = TrangTri_ten;}

    public float getTrangTri_gia() {return TrangTri_gia;}
    public void setTrangTri_gia(float TrangTri_gia) {this.TrangTri_gia = TrangTri_gia;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
