/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.GiaiTri;
import com.dtbuu.repositories.RepoGiaiTri;
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
public class ImpRepoGiaiTri implements RepoGiaiTri {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<GiaiTri> getGiaiTris(String keyword, int page) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<GiaiTri> query = builder.createQuery(GiaiTri.class);
        Root root = query.from(GiaiTri.class);
        query = query.select(root);

        if (!keyword.isEmpty() && keyword != null) {
            Predicate p = builder.like(root.get("GiaiTri_ten").as(String.class),
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
    public GiaiTri getGiaiTriByID(int GiaiTri_id) {
        return this.sessionFactory.getObject().getCurrentSession().get(GiaiTri.class, GiaiTri_id);
    }

    @Override
    public boolean addOrUpdate(GiaiTri giaiTri) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (giaiTri.getGiaiTri_id() > 0) {
                s.update(giaiTri);
            } else {
                s.save(giaiTri);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteGiaiTri(int GiaiTri_id) {
        try {
            Session s = this.sessionFactory.getObject().getCurrentSession();
            GiaiTri g = s.get(GiaiTri.class, GiaiTri_id);
            s.delete(g);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;

    }

    @Override
    public long countGiaiTris() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        org.hibernate.query.Query q = session.createQuery("Select Count(*) From GiaiTri");

        return Long.parseLong(q.getSingleResult().toString());
    }

    @Override
    public List<GiaiTri> getGiaiTris() {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM GiaiTri");

        return q.getResultList();
    }

}
