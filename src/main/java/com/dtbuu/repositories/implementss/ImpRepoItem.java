/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Items;
import com.dtbuu.pojos.Menu;
import com.dtbuu.repositories.RepoItem;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
public class ImpRepoItem implements RepoItem {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Items> getItemses(String kw) {
        Session s = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<Items> query = builder.createQuery(Items.class);
        Root root = query.from(Items.class);
        query = query.select(root);

        if (!kw.isEmpty() && kw != null) {
            Predicate p = builder.like(root.get("menuten").as(String.class),
                     String.format("%%%s%%", kw));
        }

        Query q = s.createQuery(query);
        return q.getResultList();
    }
    
}
