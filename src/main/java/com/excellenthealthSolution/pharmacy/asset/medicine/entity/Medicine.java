package com.excellenthealthSolution.pharmacy.asset.medicine.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Medicine {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( unique = true )
    private Integer id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private GenericName genericName;

    @ManyToOne
    private Pharmacopoeia pharmacopoeia;
//todo -> need to more details to medicine registration

}
