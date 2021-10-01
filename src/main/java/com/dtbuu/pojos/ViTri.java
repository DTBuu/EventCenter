package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ViTri")
public class ViTri implements Serializable {
    
    @Id
    private int ViTri_id;
    
    @Column(nullable=false, length=100)
    private String ViTri_ten;
    
    @OneToMany(mappedBy = "ViTri") // (Optional) For filtering back to NhanVien.
    private List<NhanVien> list_NhanVien;

    
    public List<NhanVien> getList_NhanVien() { return this.list_NhanVien; }
    public void setList_NhanVien(List<NhanVien> list_NhanVien) { this.list_NhanVien = list_NhanVien; }

    public int getViTri_id() { return this.ViTri_id; }
    public void setViTri_id(int ViTri_id) { this.ViTri_id = ViTri_id; }

    public String getViTri_ten() { return this.ViTri_ten; }
    public void setViTri_ten(String ViTri_ten) { this.ViTri_ten = ViTri_ten; }
}
