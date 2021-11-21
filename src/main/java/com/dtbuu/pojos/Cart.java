/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author DiepHoangPhi
 */
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer suKienid;

    private String suKienloai;

    private String suKienten;

    private int soBan;

    private Date ngayBatDau;

    private Date ngayKetThuc;

    private Float phuThu;

    private String ghiChu;

    private ChuTri chuTriid;

    private Diadiemtochuc dDTCid;

    private GiaiTri giaiTriid;

    private KhachHang khachHangid;

    private Menu menuid;

    private NhanVien quanLyPhuTrach;

    private PhucVu phucVuid;

    private TrangTri trangTriid;

    private Collection<Thanhtoan> thanhtoanCollection;

    public Cart(Integer suKienid, String suKienloai, String suKienten, int soBan, Date ngayBatDau, Date ngayKetThuc, Float phuThu, String ghiChu, ChuTri chuTriid, Diadiemtochuc dDTCid, GiaiTri giaiTriid, KhachHang khachHangid, Menu menuid, NhanVien quanLyPhuTrach, PhucVu phucVuid, TrangTri trangTriid, Collection<Thanhtoan> thanhtoanCollection) {
        this.suKienid = suKienid;
        this.suKienloai = suKienloai;
        this.suKienten = suKienten;
        this.soBan = soBan;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phuThu = phuThu;
        this.ghiChu = ghiChu;
        this.chuTriid = chuTriid;
        this.dDTCid = dDTCid;
        this.giaiTriid = giaiTriid;
        this.khachHangid = khachHangid;
        this.menuid = menuid;
        this.quanLyPhuTrach = quanLyPhuTrach;
        this.phucVuid = phucVuid;
        this.trangTriid = trangTriid;
        this.thanhtoanCollection = thanhtoanCollection;
    }

    public Cart() {
        
    }

    public Integer getSuKienid() {
        return suKienid;
    }

    public void setSuKienid(Integer suKienid) {
        this.suKienid = suKienid;
    }

    public String getSuKienloai() {
        return suKienloai;
    }

    public void setSuKienloai(String suKienloai) {
        this.suKienloai = suKienloai;
    }

    public String getSuKienten() {
        return suKienten;
    }

    public void setSuKienten(String suKienten) {
        this.suKienten = suKienten;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Float getPhuThu() {
        return phuThu;
    }

    public void setPhuThu(Float phuThu) {
        this.phuThu = phuThu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public ChuTri getChuTriid() {
        return chuTriid;
    }

    public void setChuTriid(ChuTri chuTriid) {
        this.chuTriid = chuTriid;
    }

    public Diadiemtochuc getdDTCid() {
        return dDTCid;
    }

    public void setdDTCid(Diadiemtochuc dDTCid) {
        this.dDTCid = dDTCid;
    }

    public GiaiTri getGiaiTriid() {
        return giaiTriid;
    }

    public void setGiaiTriid(GiaiTri giaiTriid) {
        this.giaiTriid = giaiTriid;
    }

    public KhachHang getKhachHangid() {
        return khachHangid;
    }

    public void setKhachHangid(KhachHang khachHangid) {
        this.khachHangid = khachHangid;
    }

    public Menu getMenuid() {
        return menuid;
    }

    public void setMenuid(Menu menuid) {
        this.menuid = menuid;
    }

    public NhanVien getQuanLyPhuTrach() {
        return quanLyPhuTrach;
    }

    public void setQuanLyPhuTrach(NhanVien quanLyPhuTrach) {
        this.quanLyPhuTrach = quanLyPhuTrach;
    }

    public PhucVu getPhucVuid() {
        return phucVuid;
    }

    public void setPhucVuid(PhucVu phucVuid) {
        this.phucVuid = phucVuid;
    }

    public TrangTri getTrangTriid() {
        return trangTriid;
    }

    public void setTrangTriid(TrangTri trangTriid) {
        this.trangTriid = trangTriid;
    }

    public Collection<Thanhtoan> getThanhtoanCollection() {
        return thanhtoanCollection;
    }

    public void setThanhtoanCollection(Collection<Thanhtoan> thanhtoanCollection) {
        this.thanhtoanCollection = thanhtoanCollection;
    }

}
