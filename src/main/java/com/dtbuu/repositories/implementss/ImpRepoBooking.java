/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtbuu.repositories.implementss;

import com.dtbuu.pojos.KhachHang;
import com.dtbuu.pojos.Logins;
import com.dtbuu.pojos.Sukien;
import com.dtbuu.repositories.RepoBooking;
import com.dtbuu.repositories.RepoLogins;
import com.dtbuu.repositories.RepoSuKien;
import com.dtbuu.services.SerLogins;

import java.util.List;
import static jdk.internal.org.jline.utils.Colors.s;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DiepHoangPhi
 */
@Repository
@Transactional
public class ImpRepoBooking implements RepoBooking{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    @Autowired
    private RepoSuKien repoSuKien;
    @Autowired
    private SerLogins serLogins;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean addSuKien(Sukien event) {
        Session session = sessionFactory.getObject().getCurrentSession();
        // set id khach hang dat tiec
//        KhachHang khachHang = new KhachHang();
//        Logins ua = this.serLogins.getLoginsAuth();
//        khachHang =  session.get(KhachHang.class, ua.getLogin_id());
//        System.out.println(khachHang);
//        event.setKhachHangid(khachHang);
        Sukien sukien = (Sukien) session.save(event);
        return sukien == null? false : true;
    }

    @Override
    public Sukien findById(int id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        String sql = "SELECT s FROM Sukien s where s.suKienid = " + id;
        Query<Sukien> query = session.createQuery(sql);
        List<Sukien> list = query.list();
        return list.isEmpty()? null : list.get(0);
    }


}
