/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import com.dtbuu.repositories.RepoKhachHang;
import java.util.ArrayList;
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
 * @author Buu Duong Tan
 */
@Repository
@Transactional
public class ImpRepoKhachHang implements RepoKhachHang {
    
    @Autowired private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean addKhachHang(KhachHang customer) {
        
        Session ss = sessionFactory.getObject().getCurrentSession();
        try {
            ss.save(customer);
            return true;
        }
        catch (HibernateException he) {
            System.err.println(he.getMessage());
        }
        return false;
    }

//    @Override
//    public List<KhachHang> getKhachHang(String key) {
//        
//        Session ss = sessionFactory.getObject().getCurrentSession();
//        
//        CriteriaBuilder cb = ss.getCriteriaBuilder();
//        CriteriaQuery<KhachHang> cq = cb.createQuery(KhachHang.class);
//        Root root = cq.from(KhachHang.class);
//        cq = cq.select(root);
//        
//        if(!key.isEmpty()) {
//            Predicate p = cb.equal(root.get("???").as(String.class), key.trim());
//            cq = cq.where(p);
//        }
//        
//        Query query = ss.createQuery(cq);
//        
//        return query.getResultList();
//    }  
}
