/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DiepHoangPhi
 */
@Entity
@Table(name = "thanhtoan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thanhtoan.findAll", query = "SELECT t FROM Thanhtoan t"),
    @NamedQuery(name = "Thanhtoan.findByThanhToanid", query = "SELECT t FROM Thanhtoan t WHERE t.thanhToanid = :thanhToanid"),
    @NamedQuery(name = "Thanhtoan.findByNgayThanhToan", query = "SELECT t FROM Thanhtoan t WHERE t.ngayThanhToan = :ngayThanhToan"),
    @NamedQuery(name = "Thanhtoan.findBySoTien", query = "SELECT t FROM Thanhtoan t WHERE t.soTien = :soTien"),
    @NamedQuery(name = "Thanhtoan.findByPhuongThuc", query = "SELECT t FROM Thanhtoan t WHERE t.phuongThuc = :phuongThuc"),
    @NamedQuery(name = "Thanhtoan.findByGhiChu", query = "SELECT t FROM Thanhtoan t WHERE t.ghiChu = :ghiChu")})
public class Thanhtoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ThanhToan_id")
    private Integer thanhToanid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NgayThanhToan")
    @Temporal(TemporalType.DATE)
    private Date ngayThanhToan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoTien")
    private float soTien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PhuongThuc")
    private String phuongThuc;
    @Size(max = 100)
    @Column(name = "GhiChu")
    private String ghiChu;
    @JoinColumn(name = "SuKien_id", referencedColumnName = "SuKien_id")
    @ManyToOne(optional = false)
    private Sukien suKienid;

    public Thanhtoan() {
    }

    public Thanhtoan(Integer thanhToanid) {
        this.thanhToanid = thanhToanid;
    }

    public Thanhtoan(Integer thanhToanid, Date ngayThanhToan, float soTien, String phuongThuc) {
        this.thanhToanid = thanhToanid;
        this.ngayThanhToan = ngayThanhToan;
        this.soTien = soTien;
        this.phuongThuc = phuongThuc;
    }

    public Integer getThanhToanid() {
        return thanhToanid;
    }

    public void setThanhToanid(Integer thanhToanid) {
        this.thanhToanid = thanhToanid;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public String getPhuongThuc() {
        return phuongThuc;
    }

    public void setPhuongThuc(String phuongThuc) {
        this.phuongThuc = phuongThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Sukien getSuKienid() {
        return suKienid;
    }

    public void setSuKienid(Sukien suKienid) {
        this.suKienid = suKienid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (thanhToanid != null ? thanhToanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Thanhtoan)) {
            return false;
        }
        Thanhtoan other = (Thanhtoan) object;
        if ((this.thanhToanid == null && other.thanhToanid != null) || (this.thanhToanid != null && !this.thanhToanid.equals(other.thanhToanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dtbuu.pojos.Thanhtoan[ thanhToanid=" + thanhToanid + " ]";
    }
    
}
