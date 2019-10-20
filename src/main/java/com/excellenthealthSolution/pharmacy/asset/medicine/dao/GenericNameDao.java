package com.excellenthealthSolution.pharmacy.asset.medicine.dao;

import com.excellenthealthSolution.pharmacy.asset.medicine.entity.GenericName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericNameDao extends JpaRepository< GenericName, Long> {
}
