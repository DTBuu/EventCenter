/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.TrangTri;
import com.dtbuu.repositories.RepoTrangTri;
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
public class ImpRepoTrangTri implements RepoTrangTri{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<TrangTri> getTrangTris(String keyword,int page) {
        Session s=sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder=s.getCriteriaBuilder();
        CriteriaQuery<TrangTri> query =builder.createQuery(TrangTri.class);
        Root root=query.from(TrangTri.class);
        query=query.select(root);
        
        if (!keyword.isEmpty() && keyword!=null) {
            Predicate p=builder.like(root.get("TrangTri_ten").as(String.class)
                    ,String.format("%%%s%%", keyword));
            query=query.where(p);
        }
        
        Query q=s.createQuery(query);
        int max=6;
        q.setMaxResults(max);
        q.setFirstResult((page - 1) * max); 
        return q.getResultList();
    }

    @Override
    public TrangTri getTrangTriByID(int TrangTri_id) {
        return this.sessionFactory.getObject().getCurrentSession().get(TrangTri.class, TrangTri_id);
    }

    @Override
    public boolean addOrUpdate(TrangTri trangTri) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (trangTri.getTrangTri_id()> 0) {
                s.update(trangTri);
            } else {
                s.save(trangTri);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteTrangTri(int TrangTri_id) {
        try {
            Session s = this.sessionFactory.getObject().getCurrentSession();
            TrangTri t = s.get(TrangTri.class, TrangTri_id);
            s.delete(t);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public long countTrangTris() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        org.hibernate.query.Query q = session.createQuery("Select Count(*) From TrangTri");
        
        return Long.parseLong(q.getSingleResult().toString());
    }

    @Override
    public List<TrangTri> getTrangTris() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM TrangTri");
        
        return q.getResultList();
    }
    
}
