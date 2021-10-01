/*
==================================================DATA ACCESS LAYER==================================================
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.NhanVien;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dtbuu.repositories.RepoViTri;

/**
 *
 * @author Buu Duong Tan
 */
@Repository
@Transactional
public class ImpRepoViTri implements RepoViTri {
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override 
    public List<NhanVien> loadTableViTri() {
        Session ss = sessionFactory.getObject().getCurrentSession();
        Query q = ss.createQuery("FROM ViTri");
        
        return q.getResultList();
    }
}
