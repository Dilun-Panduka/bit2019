package com.excellenthealthSolution.pharmacy.asset.process.generalLedger.dao;

import com.excellenthealthSolution.pharmacy.asset.process.generalLedger.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedgerDao extends JpaRepository< Ledger, Long > {
}
