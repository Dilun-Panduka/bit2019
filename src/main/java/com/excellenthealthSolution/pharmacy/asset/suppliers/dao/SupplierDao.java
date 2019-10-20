package com.excellenthealthSolution.pharmacy.asset.suppliers.dao;

import com.excellenthealthSolution.pharmacy.asset.suppliers.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
    Supplier findFirstByOrderByIdDesc();

    Supplier findByNumber(String number);
}
