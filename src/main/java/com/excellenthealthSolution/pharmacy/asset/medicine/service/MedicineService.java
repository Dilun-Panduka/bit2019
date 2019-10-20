package com.excellenthealthSolution.pharmacy.asset.medicine.service;

import com.excellenthealthSolution.pharmacy.asset.employee.entity.Employee;
import com.excellenthealthSolution.pharmacy.asset.medicine.dao.MedicineDao;
import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Medicine;
import com.excellenthealthSolution.pharmacy.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService implements AbstractService< Medicine, Long > {
    private final MedicineDao medicineDao;

    @Autowired
    public MedicineService(MedicineDao medicineDao) {
        this.medicineDao = medicineDao;
    }


    @Override
    public List< Medicine > findAll() {
        return medicineDao.findAll();
    }

    @Override
    public Medicine findById(Long id) {
        return null;
    }

    @Override
    public Medicine persist(Medicine medicine) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List< Medicine > search(Medicine medicine) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example< Medicine > medicineExample = Example.of(medicine, matcher);
        return medicineDao.findAll(medicineExample);
    }
}
