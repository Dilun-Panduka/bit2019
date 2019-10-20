package com.excellenthealthSolution.pharmacy.security.dao;

import com.excellenthealthSolution.pharmacy.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface RoleDao extends JpaRepository<Role, Integer> {
}
