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
@Table(name="menus")
public class Menu implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Menu_id")
    private Integer menuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Menu_ten")
    private String menuten;
    @Size(max = 100)
    @Column(name = "GhiChu")
    private String ghiChu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menu")
    private Collection<ItemsInMenus> itemsInMenusCollection;

    private static final long serialVersionUID = 1L;

    public Menu() {
    }

    public Menu(Integer menuid) {
        this.menuid = menuid;
    }

    public Menu(Integer menuid, String menuten) {
        this.menuid = menuid;
        this.menuten = menuten;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuten() {
        return menuten;
    }

    public void setMenuten(String menuten) {
        this.menuten = menuten;
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
        hash += (menuid != null ? menuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.menuid == null && other.menuid != null) || (this.menuid != null && !this.menuid.equals(other.menuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dtbuu.pojos.Menu[ menuid=" + menuid + " ]";
    }
    
    
}
