/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Cart;
import com.dtbuu.pojos.Sukien;
import com.dtbuu.repositories.RepoSuKien;
import java.util.List;
import java.util.Map;
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
public class ImpRepoSuKien implements RepoSuKien{
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public Sukien getSuKienbyID(int suKienid) {
        return this.sessionFactory.getObject().getCurrentSession().get(Sukien.class, suKienid);
    }

    @Override
    public boolean deleteSuKien(int suKienid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public boolean addOrUpdateSuKien(Sukien suKien) {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (suKien.getSuKienid()==null) {
                s.save(suKien);
                return true;
            }
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Sukien> getSuKiens(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
