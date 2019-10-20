package com.excellenthealthSolution.pharmacy.asset.process.finance.entity;

import com.excellenthealthSolution.pharmacy.security.entity.User;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode( callSuper = true )
public class Refund extends AuditEntity {

    @OneToOne( fetch = FetchType.LAZY )
    private Invoice invoice;


    @Column( name = "amount", precision = 10, scale = 2 )
    private BigDecimal amount;


    @Column( name = "reason", length = 45 )
    private String reason;

}
