package com.excellenthealthSolution.pharmacy.security.entity;

import javax.persistence.*;

@Entity
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;

    private String roleName;

    public Role(Integer id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }


    public Role() {

    }

    public Integer getId() {
        return this.id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
