/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.ItemsInMenus;
import com.dtbuu.pojos.Menu;
import com.dtbuu.repositories.RepoMenu;
import com.dtbuu.services.SerMenu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
public class ImpSerMenu implements SerMenu {
    @Autowired
    private RepoMenu repoMenu;
    
    @Override
    public List<Menu> getMenus(String keyword) {
        return this.repoMenu.getMenus(keyword);
    }

    @Override
    public Menu getMenuByID(int menuid) {
        return this.repoMenu.getMenuByID(menuid);
    }

    @Override
    public List<ItemsInMenus> getItemsInMenus(String keyword) {
        return this.repoMenu.getItemsInMenus(keyword);
    }

    @Override
    public boolean save(ItemsInMenus iim) {
        return this.repoMenu.save(iim);
    }

    @Override
    public List<Menu> getMenus() {
        return this.repoMenu.getMenus();
    }



    
}
