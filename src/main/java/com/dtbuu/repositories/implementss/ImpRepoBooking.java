/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Cart;
import com.dtbuu.repositories.RepoBooking;
import com.dtbuu.repositories.RepoSuKien;
import java.util.Map;
import jdk.javadoc.internal.doclets.toolkit.util.Utils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
@Transactional
public class ImpRepoBooking implements RepoBooking{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private RepoSuKien repoSuKien;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean addSuKien(Map<Integer, Cart> cart) {
        return false;
//        if (cart == null) {
//            return false;
//        }
//
//        Session session = this.sessionFactory.getObject().getCurrentSession();
//
//        Map<String, Integer> stats = Utils.getCartStats(cart);
//
//        try {
//            SaleOrder order = new SaleOrder();
//            order.setAmount(stats.get("totalAmount"));
//            order.setUser(session.get(User.class, 6));
//            session.save(order);
//
//            cart.values().stream().map(c -> {
//                OrderDetail d = new OrderDetail();
//                d.setSaleOrder(order);
//                d.setQuantity(c.getQuantity());
//                d.setPrice(c.getPrice());
//                d.setProduct(this.productRepository.getProductById(c.getProductId()));
//                return d;
//            }).forEachOrdered(d -> {
//                session.save(d);
//            });
//            
//            return true;
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
//
//        return false;
    }
    
    
}
