package com.excellenthealthSolution.pharmacy.asset.customer.dao;

import com.excellenthealthSolution.pharmacy.asset.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    Customer findFirstByOrderByIdDesc();

    Customer findByNic(String nic);

    Customer findByNumber(String number);
}
