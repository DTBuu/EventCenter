/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Thanhtoan;
import com.dtbuu.repositories.RepoPayment;
import java.io.Serializable;
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
public class ImpRepoPayment implements RepoPayment {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean save(Thanhtoan payment) {
        Session session = sessionFactory.getObject().getCurrentSession();
        Serializable serializable = session.save(payment);
        return serializable == null? false : true;
    }
}
