/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.repositories.RepoKhachHang;
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

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean addKhachHang(KhachHang customer) {

        Session ss = sessionFactory.getObject().getCurrentSession();
        try {
            ss.save(customer);
            return true;
        } catch (HibernateException he) {
            System.err.println(he.getMessage());
        }
        return false;
    }

    @Override
    public List<KhachHang> getKhachHangs(String keyword, int page) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<KhachHang> query = builder.createQuery(KhachHang.class);
        Root root = query.from(KhachHang.class);
        query = query.select(root);

        if (!keyword.isEmpty() && keyword != null) {
            Predicate p = builder.like(root.get("Ten").as(String.class),
                     String.format("%%%s%%", keyword));
            query = query.where(p);
        }

        Query q = s.createQuery(query);
        int max = 6;
        q.setMaxResults(max);
        q.setFirstResult((page - 1) * max);
        return q.getResultList();
    }

    @Override
    public long countKhachHangs() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        org.hibernate.query.Query q = session.createQuery("Select Count(*) From KhachHang");

        return Long.parseLong(q.getSingleResult().toString());
    }

    @Override
    public KhachHang getKhachHangByLoginID(int Login) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<KhachHang> query = builder.createQuery(KhachHang.class);
        Root<KhachHang> root = query.from(KhachHang.class);
//        query = query.select(root);
        query.select(root).where(builder.equal(root.get("KhachHang_id"), Login));
        Query q=s.createQuery(query);
        q.setMaxResults(1);
        List<KhachHang> result = q.getResultList();
        
        return result.get(0);
        
        
    }

    @Override
    public List<KhachHang> findKhachHangByLoginID(String login_id) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<KhachHang> query = builder.createQuery(KhachHang.class);
        Root root = query.from(KhachHang.class);
        query = query.select(root);

        if (!login_id.isEmpty() && login_id != null) {
            Predicate p = builder.like(root.get("Login").as(String.class),
                     String.format("%%%s%%", login_id));
            query = query.where(p);
        }

        Query q = s.createQuery(query);
        return q.getResultList();
    }
}
