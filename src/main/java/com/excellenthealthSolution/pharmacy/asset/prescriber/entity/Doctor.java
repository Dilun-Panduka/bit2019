package com.excellenthealthSolution.pharmacy.asset.prescriber.entity;

import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Gender;
import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Title;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode( callSuper = true )
public class Doctor extends AuditEntity {

    @Enumerated(EnumType.STRING)
    private Title title;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(fetch = FetchType.EAGER)
    private Consultations consultations;

    @Column(unique = true)
    private Integer SLMCNumber;

    private String mobile;

    private String land;

    @Email(message = "Please provide valid email")
    private String email;

    private String description;

}
