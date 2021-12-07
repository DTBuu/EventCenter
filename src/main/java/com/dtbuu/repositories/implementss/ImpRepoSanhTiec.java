/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Diadiemtochuc;
import com.dtbuu.repositories.RepoSanhTiec;
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
public class ImpRepoSanhTiec implements RepoSanhTiec {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<Diadiemtochuc> getSanhTiecs(String keyword,int page) {
        Session s=sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder=s.getCriteriaBuilder();
        CriteriaQuery<Diadiemtochuc> query =builder.createQuery(Diadiemtochuc.class);
        Root root=query.from(Diadiemtochuc.class);
        query=query.select(root);
        
        if (!keyword.isEmpty() && keyword!=null) {
            Predicate p=builder.like(root.get("DDTC_ten").as(String.class)
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
    @Transactional
    public Diadiemtochuc getSanhTiecbyID(int sanhID) {
        return this.sessionFactory.getObject().getCurrentSession().get(Diadiemtochuc.class, sanhID);
    }

    @Override
    @Transactional
    public boolean deleteSanh(int DDTC_id) {
        try {
            Session s = this.sessionFactory.getObject().getCurrentSession();
            Diadiemtochuc p = s.get(Diadiemtochuc.class, DDTC_id);
            s.delete(p);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean addOrUpdateSanh(Diadiemtochuc sanh) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (sanh.getDDTC_id() > 0) {
                s.update(sanh);
            } else {
                s.save(sanh);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Diadiemtochuc> getSanhTiecs() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM Diadiemtochuc");
        
        return q.getResultList();
    }

    @Override
    public long countSanhTiecs() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        org.hibernate.query.Query q = session.createQuery("Select Count(*) From Diadiemtochuc");
        
        return Long.parseLong(q.getSingleResult().toString());
    }

}

