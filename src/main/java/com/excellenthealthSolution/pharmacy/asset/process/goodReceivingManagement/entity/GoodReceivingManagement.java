package com.excellenthealthSolution.pharmacy.asset.process.goodReceivingManagement.entity;

import com.excellenthealthSolution.pharmacy.security.entity.User;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@EqualsAndHashCode( callSuper = true )
public class GoodReceivingManagement extends AuditEntity {

    private String quantity;

    private BigDecimal itemPrice;


    //todo-> need more thing



//todo -> supplier medicine


}



