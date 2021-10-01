/*
==================================================BUSINESS LOGICAL LAYER==================================================
 */
package com.dtbuu.services.implementss;

import com.dtbuu.pojos.NhanVien;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dtbuu.repositories.RepoViTri;
import com.dtbuu.services.SerViTri;

/**
 *
 * @author Buu Duong Tan
 */
@Service
public class ImpSerViTri implements SerViTri {
    
    @Autowired
    private RepoViTri repoNhanVien;

    @Override
    public List<NhanVien> loadTableViTri() {
        return this.repoNhanVien.loadTableViTri();
    }
}
