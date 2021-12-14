package com.dtbuu.services.implementss;

import com.dtbuu.pojos.Sukien;
import com.dtbuu.repositories.RepoBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dtbuu.services.SerBooking;
import org.springframework.stereotype.Repository;

@Service
@Repository
public class ImpSerBooking implements SerBooking {

    @Autowired
    private RepoBooking repoBooking;

    @Override
    public Sukien findById(int id) {
        return repoBooking.findById(id);
    }
}
