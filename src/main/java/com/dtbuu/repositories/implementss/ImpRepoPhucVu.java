/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.PhucVu;
import com.dtbuu.repositories.RepoPhucVu;
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
public class ImpRepoPhucVu implements RepoPhucVu {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional
    public List<PhucVu> getPhucVus(String keyword) {
        Session s=sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder=s.getCriteriaBuilder();
        CriteriaQuery<PhucVu> query =builder.createQuery(PhucVu.class);
        Root root=query.from(PhucVu.class);
        query=query.select(root);
        
        if (!keyword.isEmpty() && keyword!=null) {
            Predicate p=builder.like(root.get("PhucVu_id").as(String.class)
                    ,String.format("%%%s%%", keyword));
        }
        
        Query q=s.createQuery(query);
        return q.getResultList();
    }

    @Override
    public PhucVu getPhucVuByID(int PhucVu_id) {
        return this.sessionFactory.getObject().getCurrentSession().get(PhucVu.class, PhucVu_id);
    }

    @Override
    public boolean addOrUpdate(PhucVu phucVu) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (phucVu.getPhucVu_id()> 0) {
                s.update(phucVu);
            } else {
                s.save(phucVu);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deletePhucVu(int PhucVu_id) {
        try {
            Session s = this.sessionFactory.getObject().getCurrentSession();
            PhucVu p = s.get(PhucVu.class, PhucVu_id);
            s.delete(p);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
}
