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
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 *
 * @author Buu Duong Tan
 */
@Repository
@Transactional
public class ImpRepoNhanVien implements RepoNhanVien{
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public List<NhanVien> loadTableNhanVien() {
        Session ss = sessionFactory.getObject().getCurrentSession();
        Query q = ss.createQuery("FROM NhanVien");
        
        return q.getResultList();
    }
    
}
