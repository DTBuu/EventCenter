package com.dtbuu.services.implementss;

import com.dtbuu.pojos.Thanhtoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dtbuu.repositories.RepoPayment;
import com.dtbuu.services.SerPayment;
import org.springframework.stereotype.Repository;

@Service
@Repository
public class ImpSerPayment implements SerPayment {

    @Autowired
    private RepoPayment paymentRepository;

    @Override
    public boolean save(Thanhtoan thanhtoan) {
        return paymentRepository.save(thanhtoan);
    }
}
