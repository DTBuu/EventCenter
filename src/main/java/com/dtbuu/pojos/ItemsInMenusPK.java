/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author DiepHoangPhi
 */
@Embeddable
public class ItemsInMenusPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Menu_id")
    private int menuid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Item_id")
    private int itemid;

    public ItemsInMenusPK() {
    }

    public ItemsInMenusPK(int menuid, int itemid) {
        this.menuid = menuid;
        this.itemid = itemid;
    }

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) menuid;
        hash += (int) itemid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsInMenusPK)) {
            return false;
        }
        ItemsInMenusPK other = (ItemsInMenusPK) object;
        if (this.menuid != other.menuid) {
            return false;
        }
        if (this.itemid != other.itemid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dtbuu.pojos.ItemsInMenusPK[ menuid=" + menuid + ", itemid=" + itemid + " ]";
    }
    
}
