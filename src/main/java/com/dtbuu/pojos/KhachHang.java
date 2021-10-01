/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Buu Duong Tan
 */
@Entity
@Table(name="KhachHang")
public class KhachHang implements Serializable {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String KhachHang_id;
    
    @OneToOne @JoinColumn(name="Login_id") // Foreign Key.
    private Logins Login;
    
    @Column(nullable=false, length=100)
    private String Ho;
    
    @Column(nullable=false, length=100)
    private String Ten;
    
    @Column(nullable=false)
    private String NgaySinh;
    
    @Column(nullable=false, length=100)
    private String QueQuan;
    
    @Column(nullable=false, length=10)
    private String Sdt;
    
    @Column(nullable=false, length=100)
    private String Email;
    
    @Column(length=100)
    private String GhiChu;



    public String getKhachHang_id() {return KhachHang_id;}
    public void setKhachHang_id(String KhachHang_id) {this.KhachHang_id = KhachHang_id;}

    public Logins getLogin() {return Login;}
    public void setLogin(Logins Login) {this.Login = Login;}

    public String getHo() {return Ho;}
    public void setHo(String Ho) {this.Ho = Ho;}

    public String getTen() {return Ten;}
    public void setTen(String Ten) {this.Ten = Ten;}

    public String getNgaySinh() {return NgaySinh;}
    public void setNgaySinh(String NgaySinh) {this.NgaySinh = NgaySinh;}

    public String getQueQuan() {return QueQuan;}
    public void setQueQuan(String QueQuan) {this.QueQuan = QueQuan;}

    public String getSdt() {return Sdt;}
    public void setSdt(String Sdt) {this.Sdt = Sdt;}

    public String getEmail() {return Email;}
    public void setEmail(String Email) {this.Email = Email;}

    public String getGhiChu() {return GhiChu;}
    public void setGhiChu(String GhiChu) {this.GhiChu = GhiChu;}
}
