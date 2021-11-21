/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories;

import com.dtbuu.pojos.Items;
import com.dtbuu.pojos.ItemsInMenus;
import com.dtbuu.pojos.ItemsInMenusPK;
import com.dtbuu.pojos.Menu;
import java.util.List;

/**
 *
 * @author DiepHoangPhi
 */
public interface RepoMenu {
    List<Menu> getMenus(String keyword);
    Menu getMenuByID(int menuid);
    List<ItemsInMenus> getItemsInMenus(String keyword);
    boolean save(ItemsInMenus itemsInMenus);
}
