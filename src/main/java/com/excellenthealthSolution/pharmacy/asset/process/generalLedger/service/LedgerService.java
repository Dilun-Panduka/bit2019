package com.excellenthealthSolution.pharmacy.asset.process.generalLedger.service;

import com.excellenthealthSolution.pharmacy.asset.process.generalLedger.dao.LedgerDao;
import com.excellenthealthSolution.pharmacy.asset.process.generalLedger.entity.Ledger;
import com.excellenthealthSolution.pharmacy.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LedgerService implements AbstractService< Ledger, Long > {
    private final LedgerDao ledgerDao;

    @Autowired
    public LedgerService(LedgerDao ledgerDao) {
        this.ledgerDao = ledgerDao;
    }

    @Override
    public List< Ledger > findAll() {
        return ledgerDao.findAll();
    }

    @Override
    public Ledger findById(Long id) {
        return null;
    }

    @Override
    public Ledger persist(Ledger ledger) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List< Ledger > search(Ledger ledger) {
        return null;
    }
}
