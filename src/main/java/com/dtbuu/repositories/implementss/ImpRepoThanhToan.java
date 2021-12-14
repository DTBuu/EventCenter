/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.Sukien;
import com.dtbuu.repositories.RepoThanhToan;
import com.dtbuu.services.SerChuTri;
import com.dtbuu.services.SerGiaiTri;
import com.dtbuu.services.SerMenu;
import com.dtbuu.services.SerPhucVu;
import com.dtbuu.services.SerSanhTiec;
import com.dtbuu.services.SerSuKien;
import com.dtbuu.services.SerTrangTri;
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
public class ImpRepoThanhToan implements RepoThanhToan {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private SerSuKien serSuKien;
    @Autowired
    private SerSanhTiec serSanhTiec;
    @Autowired
    private SerMenu serMenu;
    @Autowired
    private SerChuTri serChuTri;
    @Autowired
    private SerPhucVu serPhucVu;
    @Autowired
    private SerTrangTri serTrangTri;
    @Autowired
    private SerGiaiTri serGiaiTri;
    
    
    
    @Override
    public boolean addThanhToan(int suKienid) {
        Session session=this.sessionFactory.getObject().getCurrentSession();
        try {
            Sukien sukien=this.serSuKien.getSuKienbyID(suKienid); 
            
        } catch (HibernateException e) {
            System.err.println("==Add bill error==" + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
    
}
