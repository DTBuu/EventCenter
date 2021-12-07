/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.ItemsInMenus;
import com.dtbuu.pojos.ItemsInMenusPK;
import com.dtbuu.repositories.RepoMenu;
import com.dtbuu.pojos.Menu;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
@Transactional
public class ImpRepoMenu implements RepoMenu {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Menu> getMenus(String keyword) {
        Session s=sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder=s.getCriteriaBuilder();
        CriteriaQuery<Menu> query =builder.createQuery(Menu.class);
        Root root=query.from(Menu.class);
        query=query.select(root);
        
        if (!keyword.isEmpty() && keyword!=null) {
            Predicate p=builder.like(root.get("menuten").as(String.class)
                    ,String.format("%%%s%%", keyword));
        }
        
        Query q=s.createQuery(query);
        return q.getResultList();
    }

    @Override
    public Menu getMenuByID(int menuid) {
        return this.sessionFactory.getObject().getCurrentSession().get(Menu.class, menuid);
    }

    @Override
    public List<ItemsInMenus> getItemsInMenus(String keyword) {
        Session s=sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder=s.getCriteriaBuilder();
        CriteriaQuery<ItemsInMenus> query =builder.createQuery(ItemsInMenus.class);
        Root root=query.from(ItemsInMenus.class);
        query=query.select(root);
        
        if (!keyword.isEmpty() && keyword!=null) {
            Predicate p=builder.like(root.get("itemsInMenusPK").as(String.class)
                    ,String.format("%%%s%%", keyword));
        } 
        
        Query q=s.createQuery(query);
        return q.getResultList();
    }

//    @Override
//    public ItemsInMenus save(int menu, int items, int soLuong, float giaMotDV) {
//        Session s = this.sessionFactory.getObject().getCurrentSession();
//        ItemsInMenus i=new ItemsInMenus();
//        i.setItemsInMenusPK(new ItemsInMenusPK(menu,items));
//        i.setGiaMotDV(giaMotDV);
//        i.setSoLuong(soLuong);
//        return s.save(i);
//    }

    @Override
    public boolean save(ItemsInMenus iim) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (iim.getItemsInMenusPK()==null) {
                s.update(iim);
            } else {
                s.save(iim);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Menu> getMenus() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Menu");
        
        return q.getResultList();
    }
    
}
