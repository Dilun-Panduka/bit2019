package com.excellenthealthSolution.pharmacy.asset.medicine.entity;

        import com.excellenthealthSolution.pharmacy.asset.medicine.entity.Enum.PharmacopoeiasShortCode;
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
public class Pharmacopoeia {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( unique = true )
    private Integer id;

    @Enumerated( EnumType.STRING )
    private PharmacopoeiasShortCode pharmacopoeiasShortCode;

    @OneToMany(mappedBy = "pharmacopoeia")
    private List<Medicine> medicines;

}
