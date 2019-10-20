package com.excellenthealthSolution.pharmacy.asset.prescriber.dao;

import com.excellenthealthSolution.pharmacy.asset.prescriber.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface DoctorDao extends JpaRepository<Doctor, Integer> {
}
