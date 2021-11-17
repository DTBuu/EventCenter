/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author DiepHoangPhi
 */
@Entity
@Table(name = "sukien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sukien.findAll", query = "SELECT s FROM Sukien s"),
    @NamedQuery(name = "Sukien.findBySuKienid", query = "SELECT s FROM Sukien s WHERE s.suKienid = :suKienid"),
    @NamedQuery(name = "Sukien.findBySuKienloai", query = "SELECT s FROM Sukien s WHERE s.suKienloai = :suKienloai"),
    @NamedQuery(name = "Sukien.findBySuKienten", query = "SELECT s FROM Sukien s WHERE s.suKienten = :suKienten"),
    @NamedQuery(name = "Sukien.findBySoBan", query = "SELECT s FROM Sukien s WHERE s.soBan = :soBan"),
    @NamedQuery(name = "Sukien.findByNgayBatDau", query = "SELECT s FROM Sukien s WHERE s.ngayBatDau = :ngayBatDau"),
    @NamedQuery(name = "Sukien.findByNgayKetThuc", query = "SELECT s FROM Sukien s WHERE s.ngayKetThuc = :ngayKetThuc"),
    @NamedQuery(name = "Sukien.findByPhuThu", query = "SELECT s FROM Sukien s WHERE s.phuThu = :phuThu"),
    @NamedQuery(name = "Sukien.findByGhiChu", query = "SELECT s FROM Sukien s WHERE s.ghiChu = :ghiChu")})
public class Sukien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SuKien_id")
    private Integer suKienid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SuKien_loai")
    private String suKienloai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SuKien_ten")
    private String suKienten;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoBan")
    private int soBan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayBatDau")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date ngayBatDau;
    @Column(name = "NgayKetThuc")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date ngayKetThuc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PhuThu")
    private Float phuThu;
    @Size(max = 100)
    @Column(name = "GhiChu")
    private String ghiChu;
    @JoinColumn(name = "ChuTri_id", referencedColumnName = "ChuTri_id")
    @ManyToOne(optional = false)
    private ChuTri chuTriid;
    @JoinColumn(name = "DDTC_id", referencedColumnName = "DDTC_id")
    @ManyToOne(optional = false)
    private Diadiemtochuc dDTCid;
    @JoinColumn(name = "GiaiTri_id", referencedColumnName = "GiaiTri_id")
    @ManyToOne(optional = false)
    private GiaiTri giaiTriid;
    @JoinColumn(name = "KhachHang_id", referencedColumnName = "KhachHang_id")
    @ManyToOne(optional = false)
    private KhachHang khachHangid;
    @JoinColumn(name = "Menu_id", referencedColumnName = "Menu_id")
    @ManyToOne(optional = false)
    private Menu menuid;
    @JoinColumn(name = "QuanLyPhuTrach", referencedColumnName = "NhanVien_id")
    @ManyToOne(optional = false)
    private NhanVien quanLyPhuTrach;
    @JoinColumn(name = "PhucVu_id", referencedColumnName = "PhucVu_id")
    @ManyToOne(optional = false)
    private PhucVu phucVuid;
    @JoinColumn(name = "TrangTri_id", referencedColumnName = "TrangTri_id")
    @ManyToOne(optional = false)
    private TrangTri trangTriid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "suKienid")
    private Collection<Thanhtoan> thanhtoanCollection;

    public Sukien() {
    }

//    public Sukien(Integer suKienid) {
//        this.suKienid = suKienid;
//    }
    public Sukien(Integer suKienid, String suKienloai, String suKienten, int soBan, Date ngayBatDau) {
        this.suKienid = suKienid;
        this.suKienloai = suKienloai;
        this.suKienten = suKienten;
        this.soBan = soBan;
        this.ngayBatDau = ngayBatDau;
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

    @XmlTransient
    public Collection<Thanhtoan> getThanhtoanCollection() {
        return thanhtoanCollection;
    }

    public void setThanhtoanCollection(Collection<Thanhtoan> thanhtoanCollection) {
        this.thanhtoanCollection = thanhtoanCollection;
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

//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (suKienid != null ? suKienid.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Sukien)) {
//            return false;
//        }
//        Sukien other = (Sukien) object;
//        if ((this.suKienid == null && other.suKienid != null) || (this.suKienid != null && !this.suKienid.equals(other.suKienid))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.dtbuu.pojos.Sukien[ suKienid=" + suKienid + " ]";
//    }
}
