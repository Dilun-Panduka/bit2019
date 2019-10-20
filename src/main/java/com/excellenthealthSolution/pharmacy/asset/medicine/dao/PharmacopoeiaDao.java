package com.excellenthealthSolution.pharmacy.asset.medicine.dao;

import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Pharmacopoeia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacopoeiaDao extends JpaRepository< Pharmacopoeia, Long > {
}
