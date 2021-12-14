package com.dtbuu.services;

import com.dtbuu.pojos.Sukien;
import org.springframework.stereotype.Service;

@Service
public interface SerBooking {
    Sukien findById(int id);
}
