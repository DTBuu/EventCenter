/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DiepHoangPhi
 */
@Entity
@Table(name = "items_in_menus", catalog = "eventcenter", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemsInMenus.findAll", query = "SELECT i FROM ItemsInMenus i"),
    @NamedQuery(name = "ItemsInMenus.findByMenuid", query = "SELECT i FROM ItemsInMenus i WHERE i.itemsInMenusPK.menuid = :menuid"),
    @NamedQuery(name = "ItemsInMenus.findByItemid", query = "SELECT i FROM ItemsInMenus i WHERE i.itemsInMenusPK.itemid = :itemid"),
    @NamedQuery(name = "ItemsInMenus.findByGiaMotDV", query = "SELECT i FROM ItemsInMenus i WHERE i.giaMotDV = :giaMotDV"),
    @NamedQuery(name = "ItemsInMenus.findBySoLuong", query = "SELECT i FROM ItemsInMenus i WHERE i.soLuong = :soLuong"),
    @NamedQuery(name = "ItemsInMenus.findByGhiChu", query = "SELECT i FROM ItemsInMenus i WHERE i.ghiChu = :ghiChu")})
public class ItemsInMenus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemsInMenusPK itemsInMenusPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GiaMotDV")
    private float giaMotDV;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoLuong")
    private int soLuong;
    @Size(max = 100)
    @Column(name = "GhiChu")
    private String ghiChu;
    @JoinColumn(name = "Item_id", referencedColumnName = "Item_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Items items;
    @JoinColumn(name = "Menu_id", referencedColumnName = "Menu_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Menu menu;

    public ItemsInMenus() {
    }

    public ItemsInMenus(ItemsInMenusPK itemsInMenusPK) {
        this.itemsInMenusPK = itemsInMenusPK;
    }

    public ItemsInMenus(ItemsInMenusPK itemsInMenusPK, float giaMotDV, int soLuong) {
        this.itemsInMenusPK = itemsInMenusPK;
        this.giaMotDV = giaMotDV;
        this.soLuong = soLuong;
    }

    public ItemsInMenus(int menuid, int itemid) {
        this.itemsInMenusPK = new ItemsInMenusPK(menuid, itemid);
    }

    public ItemsInMenusPK getItemsInMenusPK() {
        return itemsInMenusPK;
    }

    public void setItemsInMenusPK(ItemsInMenusPK itemsInMenusPK) {
        this.itemsInMenusPK = itemsInMenusPK;
    }

    
    
    
//    public ItemsInMenusPK getItemsInMenusPK() {
//        return itemsInMenusPK;
//    }
//
//    public void setItemsInMenusPK(ItemsInMenusPK itemsInMenusPK) {
//        this.itemsInMenusPK = itemsInMenusPK;
//    }

    public float getGiaMotDV() {
        return giaMotDV;
    }

    public void setGiaMotDV(float giaMotDV) {
        this.giaMotDV = giaMotDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemsInMenusPK != null ? itemsInMenusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsInMenus)) {
            return false;
        }
        ItemsInMenus other = (ItemsInMenus) object;
        if ((this.itemsInMenusPK == null && other.itemsInMenusPK != null) || (this.itemsInMenusPK != null && !this.itemsInMenusPK.equals(other.itemsInMenusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dtbuu.pojos.ItemsInMenus[ itemsInMenusPK=" + itemsInMenusPK + " ]";
    }
    
}
