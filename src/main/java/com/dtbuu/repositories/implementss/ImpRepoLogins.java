/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Logins;
import com.dtbuu.repositories.RepoLogins;
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
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Buu Duong Tan
 */
@Repository
@Transactional
public class ImpRepoLogins implements RepoLogins {
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean addLogin(Logins login) {
        
        Session ss = sessionFactory.getObject().getCurrentSession();
        try {
            ss.save(login);
            return true;
        }
        catch (HibernateException he) {
            System.err.println(he.getMessage());
        }
        return false;
    }

    @Override
    public List<Logins> getLogins(String key) {
        
        Session ss = sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder cb = ss.getCriteriaBuilder();
        CriteriaQuery<Logins> cq = cb.createQuery(Logins.class);
        Root root = cq.from(Logins.class);
        cq = cq.select(root);
        
        if(!key.isEmpty()) {
            Predicate p = cb.equal(root.get("Login_user").as(String.class), key.trim());
            cq = cq.where(p);
        }
        
        Query query = ss.createQuery(cq);
        
        return query.getResultList();
    }

    @Override
    public Logins getLoginsAuth() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String login_id = loggedInUser.getName();
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Logins> query = builder.createQuery(Logins.class);
        Root root = query.from(Logins.class);
        query.select(root);
        Predicate p = builder.equal(root.get("Login_id").as(String.class), login_id.trim());
        query = query.where(p);
        Query q = session.createQuery(query);
        List<Logins> users = q.getResultList();
        Logins u = users.get(0);
        return u;
    }
}
