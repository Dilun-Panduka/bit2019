package com.excellenthealthSolution.pharmacy.asset.customer.entity;

import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Gender;
import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Title;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer extends AuditEntity {

    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( unique = true )
    @NotNull( message = "This code is already add or enter incorrectly" )
    private String number;

    @Enumerated( EnumType.STRING )
    private Title title;

    private String name;

    @Enumerated( EnumType.STRING )
    private Gender gender;

    @Column( unique = true )
    @Size( message = "NIC should be contained character 10 or 12", min = 10, max = 12 )
    private String nic;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    @NotNull( message = "Birthday should be included" )
    private LocalDate dateOfBirth;

    @Email( message = "Please provide a valid Email" )
    private String email;

    @Min( value = 9, message = "Should be needed to enter valid mobile number" )
    private String mobile;

    private String land;

    private LocalDate updatedAt;

    private LocalDate createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
