/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DiepHoangPhi
 */
@Entity
@Table(name ="items")
public class Items implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Item_id")
    private Integer itemid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Item_loai")
    private String itemloai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Item_ten")
    private String itemten;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Item_DonVi")
    private String itemDonVi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Item_GiaMotDV")
    private float itemGiaMotDV;
    @Size(max = 100)
    @Column(name = "GhiChu")
    private String ghiChu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Collection<ItemsInMenus> itemsInMenusCollection;

    private static final long serialVersionUID = 1L;

    public Items() {
    }

    public Items(Integer itemid) {
        this.itemid = itemid;
    }

    public Items(Integer itemid, String itemloai, String itemten, String itemDonVi, float itemGiaMotDV) {
        this.itemid = itemid;
        this.itemloai = itemloai;
        this.itemten = itemten;
        this.itemDonVi = itemDonVi;
        this.itemGiaMotDV = itemGiaMotDV;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemloai() {
        return itemloai;
    }

    public void setItemloai(String itemloai) {
        this.itemloai = itemloai;
    }

    public String getItemten() {
        return itemten;
    }

    public void setItemten(String itemten) {
        this.itemten = itemten;
    }

    public String getItemDonVi() {
        return itemDonVi;
    }

    public void setItemDonVi(String itemDonVi) {
        this.itemDonVi = itemDonVi;
    }

    public float getItemGiaMotDV() {
        return itemGiaMotDV;
    }

    public void setItemGiaMotDV(float itemGiaMotDV) {
        this.itemGiaMotDV = itemGiaMotDV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @XmlTransient
    public Collection<ItemsInMenus> getItemsInMenusCollection() {
        return itemsInMenusCollection;
    }

    public void setItemsInMenusCollection(Collection<ItemsInMenus> itemsInMenusCollection) {
        this.itemsInMenusCollection = itemsInMenusCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemid != null ? itemid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemid == null && other.itemid != null) || (this.itemid != null && !this.itemid.equals(other.itemid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dtbuu.pojos.Items[ itemid=" + itemid + " ]";
    }
    
    
    

}
