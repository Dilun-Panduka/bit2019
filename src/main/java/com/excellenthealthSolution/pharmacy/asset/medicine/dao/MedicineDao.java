package com.excellenthealthSolution.pharmacy.asset.medicine.dao;

import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineDao extends JpaRepository< Medicine, Long > {
}
