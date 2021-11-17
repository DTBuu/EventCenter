/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.NhanVien;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dtbuu.repositories.RepoNhanVien;
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

/**
 *
 * @author DiepHoangPhi
 */
@Repository
@Transactional
public class ImpRepoNhanVien implements RepoNhanVien {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<NhanVien> loadTableNhanVien(String kw) {
        Session ss = sessionFactory.getObject().getCurrentSession();
        //
        CriteriaBuilder builder = ss.getCriteriaBuilder();
        CriteriaQuery<NhanVien> query = builder.createQuery(NhanVien.class);
        Root root = query.from(NhanVien.class);
        query.select(root);

        if (!kw.isEmpty() && kw != null) {
            Predicate p = builder.like(root.get("Ho").as(String.class),
                    String.format("%%%s%%", kw));
        }

        Query q = ss.createQuery(query);
        //
//        Query q = ss.createQuery("FROM NhanVien");

        return q.getResultList();
    }

    @Override
    public NhanVien getNhanVienbyID(int NhanVien_id) {
        return this.sessionFactory.getObject().getCurrentSession().get(NhanVien.class, NhanVien_id);
    }

    @Override
    public boolean deleteNhanVien(int nhanVien_id) {
        try {
            Session session = this.sessionFactory.getObject().getCurrentSession();
            NhanVien p = session.get(NhanVien.class, nhanVien_id);
            session.delete(p);

            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean addOrUpdateNhanVien(NhanVien nhanvien) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (nhanvien.getNhanVien_id() > 0) {
                s.update(nhanvien);
            } else {
                s.save(nhanvien);
            }
            return true;

        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
