package com.dtbuu.services;

import com.dtbuu.pojos.Thanhtoan;
import org.springframework.stereotype.Service;

@Service
public interface SerPayment {
    boolean save(Thanhtoan thanhtoan);
}
