package com.excellenthealthSolution.pharmacy.asset.process.generalLedger.entity;

import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Medicine;
import com.excellenthealthSolution.pharmacy.asset.process.finance.entity.Invoice;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import lombok.*;

import javax.persistence.*;
import javax.sound.sampled.AudioFileFormat;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class Ledger extends AuditEntity {

    private Integer quantity;

    private Integer availableQuantity;

    private Integer quantityLimit;

    private BigDecimal salePrice;

    @ManyToOne(fetch = FetchType.EAGER)
    private Medicine medicine;

    @ManyToOne(fetch = FetchType.EAGER)
    private Invoice invoice;




    //todo => medicine

    //quantity price so many thing


}
