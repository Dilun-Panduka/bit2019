package com.excellenthealthSolution.pharmacy.asset.medicine.service;

import com.excellenthealthSolution.pharmacy.asset.medicine.dao.PharmacopoeiaDao;
import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Pharmacopoeia;
import com.excellenthealthSolution.pharmacy.util.interfaces.AbstractService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacopoeiaService implements AbstractService< Pharmacopoeia, Long > {
    private final PharmacopoeiaDao pharmacopoeiaDao;

    public PharmacopoeiaService(PharmacopoeiaDao pharmacopoeiaDao) {
        this.pharmacopoeiaDao = pharmacopoeiaDao;
    }

    @Override
    public List< Pharmacopoeia > findAll() {
        return pharmacopoeiaDao.findAll();
    }

    @Override
    public Pharmacopoeia findById(Long id) {
        return null;
    }

    @Override
    public Pharmacopoeia persist(Pharmacopoeia pharmacopoeia) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List< Pharmacopoeia > search(Pharmacopoeia pharmacopoeia) {
        return null;
    }
}
