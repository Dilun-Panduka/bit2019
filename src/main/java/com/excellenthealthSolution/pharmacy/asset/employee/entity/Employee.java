package com.excellenthealthSolution.pharmacy.asset.employee.entity;

import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Gender;
import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Title;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.CivilStatus;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.Designation;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.EmployeeStatus;
import com.excellenthealthSolution.pharmacy.util.audit.AuditEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class Employee extends AuditEntity {

    @NotNull(message = "Number is required")
    private String number;

    @Enumerated(EnumType.STRING)
    private Title title;

    @Size(min = 5, message = "Your name cannot be accept")
    private String name;

    @Size(min = 5, message = "At least 5 characters should be include calling name")
    private String callingName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ")
    private String nic;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private CivilStatus civilStatus;

    //@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$",message = "Please provide valid email")
    @Email
    private String email;

    @Size(min = 9, message = "Can not accept this mobile number")
    private String mobile;

    private String land;

    @Size(min = 5, message = "Should be need to provide valid address !!")
    private String address;

    @Enumerated(EnumType.STRING)
    private Designation designation;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfAssignment;


    public Employee(@NotNull(message = "Number is required") String number, Title title, @Size(min = 5, message = "Your name cannot be accept") String name, @Size(min = 5, message = "At least 5 characters should be include calling name") String callingName, Gender gender, @Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ") String nic, LocalDate dateOfBirth, CivilStatus civilStatus, @Email String email, @Size(min = 9, message = "Can not accept this mobile number") String mobile, String land, @Size(min = 5, message = "Should be need to provide valid address !!") String address, Designation designation, EmployeeStatus employeeStatus, LocalDate dateOfAssignment) {
        this.number = number;
        this.title = title;
        this.name = name;
        this.callingName = callingName;
        this.gender = gender;
        this.nic = nic;
        this.dateOfBirth = dateOfBirth;
        this.civilStatus = civilStatus;
        this.email = email;
        this.mobile = mobile;
        this.land = land;
        this.address = address;
        this.designation = designation;
        this.employeeStatus = employeeStatus;
        this.dateOfAssignment = dateOfAssignment;
    }

    public Employee() {
    }

    public @NotNull(message = "Number is required") String getNumber() {
        return this.number;
    }

    public Title getTitle() {
        return this.title;
    }

    public @Size(min = 5, message = "Your name cannot be accept") String getName() {
        return this.name;
    }

    public @Size(min = 5, message = "At least 5 characters should be include calling name") String getCallingName() {
        return this.callingName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public @Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ") String getNic() {
        return this.nic;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public CivilStatus getCivilStatus() {
        return this.civilStatus;
    }

    public @Email String getEmail() {
        return this.email;
    }

    public @Size(min = 9, message = "Can not accept this mobile number") String getMobile() {
        return this.mobile;
    }

    public String getLand() {
        return this.land;
    }

    public @Size(min = 5, message = "Should be need to provide valid address !!") String getAddress() {
        return this.address;
    }

    public Designation getDesignation() {
        return this.designation;
    }

    public EmployeeStatus getEmployeeStatus() {
        return this.employeeStatus;
    }

    public LocalDate getDateOfAssignment() {
        return this.dateOfAssignment;
    }

    public void setNumber(@NotNull(message = "Number is required") String number) {
        this.number = number;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setName(@Size(min = 5, message = "Your name cannot be accept") String name) {
        this.name = name;
    }

    public void setCallingName(@Size(min = 5, message = "At least 5 characters should be include calling name") String callingName) {
        this.callingName = callingName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setNic(@Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ") String nic) {
        this.nic = nic;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCivilStatus(CivilStatus civilStatus) {
        this.civilStatus = civilStatus;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public void setMobile(@Size(min = 9, message = "Can not accept this mobile number") String mobile) {
        this.mobile = mobile;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setAddress(@Size(min = 5, message = "Should be need to provide valid address !!") String address) {
        this.address = address;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void setDateOfAssignment(LocalDate dateOfAssignment) {
        this.dateOfAssignment = dateOfAssignment;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Employee)) return false;
        final Employee other = (Employee) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$number = this.getNumber();
        final Object other$number = other.getNumber();
        if (this$number == null ? other$number != null : !this$number.equals(other$number)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$callingName = this.getCallingName();
        final Object other$callingName = other.getCallingName();
        if (this$callingName == null ? other$callingName != null : !this$callingName.equals(other$callingName))
            return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$nic = this.getNic();
        final Object other$nic = other.getNic();
        if (this$nic == null ? other$nic != null : !this$nic.equals(other$nic)) return false;
        final Object this$dateOfBirth = this.getDateOfBirth();
        final Object other$dateOfBirth = other.getDateOfBirth();
        if (this$dateOfBirth == null ? other$dateOfBirth != null : !this$dateOfBirth.equals(other$dateOfBirth))
            return false;
        final Object this$civilStatus = this.getCivilStatus();
        final Object other$civilStatus = other.getCivilStatus();
        if (this$civilStatus == null ? other$civilStatus != null : !this$civilStatus.equals(other$civilStatus))
            return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$land = this.getLand();
        final Object other$land = other.getLand();
        if (this$land == null ? other$land != null : !this$land.equals(other$land)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$designation = this.getDesignation();
        final Object other$designation = other.getDesignation();
        if (this$designation == null ? other$designation != null : !this$designation.equals(other$designation))
            return false;
        final Object this$employeeStatus = this.getEmployeeStatus();
        final Object other$employeeStatus = other.getEmployeeStatus();
        if (this$employeeStatus == null ? other$employeeStatus != null : !this$employeeStatus.equals(other$employeeStatus))
            return false;
        final Object this$dateOfAssignment = this.getDateOfAssignment();
        final Object other$dateOfAssignment = other.getDateOfAssignment();
        if (this$dateOfAssignment == null ? other$dateOfAssignment != null : !this$dateOfAssignment.equals(other$dateOfAssignment))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Employee;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $number = this.getNumber();
        result = result * PRIME + ($number == null ? 43 : $number.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $callingName = this.getCallingName();
        result = result * PRIME + ($callingName == null ? 43 : $callingName.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $nic = this.getNic();
        result = result * PRIME + ($nic == null ? 43 : $nic.hashCode());
        final Object $dateOfBirth = this.getDateOfBirth();
        result = result * PRIME + ($dateOfBirth == null ? 43 : $dateOfBirth.hashCode());
        final Object $civilStatus = this.getCivilStatus();
        result = result * PRIME + ($civilStatus == null ? 43 : $civilStatus.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $land = this.getLand();
        result = result * PRIME + ($land == null ? 43 : $land.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $designation = this.getDesignation();
        result = result * PRIME + ($designation == null ? 43 : $designation.hashCode());
        final Object $employeeStatus = this.getEmployeeStatus();
        result = result * PRIME + ($employeeStatus == null ? 43 : $employeeStatus.hashCode());
        final Object $dateOfAssignment = this.getDateOfAssignment();
        result = result * PRIME + ($dateOfAssignment == null ? 43 : $dateOfAssignment.hashCode());
        return result;
    }

//    public String toString() {
//        return "Employee(number=" + this.getNumber() + ", title=" + this.getTitle() + ", name=" + this.getName() + ", callingName=" + this.getCallingName() + ", gender=" + this.getGender() + ", nic=" + this.getNic() + ", dateOfBirth=" + this.getDateOfBirth() + ", civilStatus=" + this.getCivilStatus() + ", email=" + this.getEmail() + ", mobile=" + this.getMobile() + ", land=" + this.getLand() + ", address=" + this.getAddress() + ", designation=" + this.getDesignation() + ", employeeStatus=" + this.getEmployeeStatus() + ", dateOfAssignment=" + this.getDateOfAssignment() + ")";
//    }
}
