package com.excellenthealthSolution.pharmacy.security.entity;

import com.excellenthealthSolution.pharmacy.asset.employee.entity.Employee;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
//@NoArgsConstructor
//@AllArgsConstructor
@JsonIgnoreProperties(value ="createdDate", allowGetters = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(nullable = false)
    @Size(min = 5, message = "user name should include at least five characters")
    private String username;

    @Column(nullable = false)
    @Size(min = 4, message = "password should include four characters or symbols")
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdDate;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User() {
        }

    public User(Employee employee, String username, String password, boolean enabled, LocalDate createdDate) {
        this.employee = employee;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return this.id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public @Size(min = 5, message = "user name should include at least five characters") String getUsername() {
        return this.username;
    }

    public @Size(min = 4, message = "password should include four characters or symbols") String getPassword() {
        return this.password;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public LocalDate getCreatedDate() {
        return this.createdDate;
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setUsername(@Size(min = 5, message = "user name should include at least five characters") String username) {
        this.username = username;
    }

    public void setPassword(@Size(min = 4, message = "password should include four characters or symbols") String password) {
        this.password = password;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
