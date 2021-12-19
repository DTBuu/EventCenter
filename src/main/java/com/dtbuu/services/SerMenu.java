/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.services;

import com.dtbuu.pojos.ItemsInMenus;
import com.dtbuu.pojos.Menu;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author DiepHoangPhi
 */
@Service
public interface SerMenu {

    List<Menu> getMenus(String keyword);

    List<Menu> getMenus();

    List<ItemsInMenus> getItemsInMenus(String keyword);

    Menu getMenuByID(int menuid);
    
    ItemsInMenus getItemsInMenusByID(int menuid);

    boolean save(ItemsInMenus itemsInMenus);

    boolean saveMenu(Menu menuid);
}
