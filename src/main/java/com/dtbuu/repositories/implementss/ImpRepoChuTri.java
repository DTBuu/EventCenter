/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.ChuTri;
import com.dtbuu.repositories.RepoChuTri;
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
public class ImpRepoChuTri implements RepoChuTri {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<ChuTri> getChuTri(String keyword,int page) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<ChuTri> query = builder.createQuery(ChuTri.class);
        Root root = query.from(ChuTri.class);
        query = query.select(root);

        if (!keyword.isEmpty() && keyword != null) {
            Predicate p = builder.like(root.get("ChuTri_ten").as(String.class),
                     String.format("%%%s%%", keyword));
            query=query.where(p);
        }

        Query q = s.createQuery(query);
        int max=6;
        q.setMaxResults(max);
        q.setFirstResult((page - 1) * max); 
        return q.getResultList();
    }

    @Override
    public ChuTri getChuTriByID(int ChuTri_id) {
        return this.sessionFactory.getObject().getCurrentSession().get(ChuTri.class, ChuTri_id);
    }

    @Override
    public boolean addOrUpdate(ChuTri chuTri) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (chuTri.getChuTri_id() > 0) {
                s.update(chuTri);
            } else {
                s.save(chuTri);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteChuTri(int ChuTri_id) {
        try {
            Session s = this.sessionFactory.getObject().getCurrentSession();
            ChuTri p = s.get(ChuTri.class, ChuTri_id);
            s.delete(p);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public long countChuTris() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        org.hibernate.query.Query q = session.createQuery("Select Count(*) From ChuTri");
        
        return Long.parseLong(q.getSingleResult().toString());
    }

    @Override
    public List<ChuTri> getChuTris() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM ChuTri");
        
        return q.getResultList();
    }

}
