package com.excellenthealthSolution.pharmacy.asset.prescriber.dao;

import com.excellenthealthSolution.pharmacy.asset.prescriber.entity.Consultations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationDao extends JpaRepository<Consultations, Integer> {
}
