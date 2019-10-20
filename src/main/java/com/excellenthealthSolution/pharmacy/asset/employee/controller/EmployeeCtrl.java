package com.excellenthealthSolution.pharmacy.asset.employee.controller;

import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Gender;
import com.excellenthealthSolution.pharmacy.asset.commonAsset.Enum.Title;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Employee;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.CivilStatus;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.Designation;
import com.excellenthealthSolution.pharmacy.asset.employee.entity.Enum.EmployeeStatus;
import com.excellenthealthSolution.pharmacy.asset.employee.service.EmployeeService;
import com.excellenthealthSolution.pharmacy.security.entity.Role;
import com.excellenthealthSolution.pharmacy.security.entity.User;
import com.excellenthealthSolution.pharmacy.security.service.RoleService;
import com.excellenthealthSolution.pharmacy.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeCtrl {
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private EmployeeService employeeService;

    private final PasswordEncoder passwordEncoder;

    public EmployeeCtrl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public User saveEmployee(){
//        Employee employee = new Employee();
//        employee.setName("Dilun");
//        employee.setCallingName("Defwrgwrgwrg");
//        employee.setAddress("wrgwrwrwe");
//        employee.setCivilStatus(CivilStatus.MARRIED);
//        employee.setDateOfBirth(LocalDate.now());
//        employee.setDesignation(Designation.ADMIN);
//        employee.setGender(Gender.MALE);
//        employee.setEmail("dilunp4@gmail.com");
//        employee.setEmployeeStatus(EmployeeStatus.WORKING);
//        employee.setLand("0112879346");
//        employee.setMobile("0772928483");
//        employee.setNumber("E0001");
//        employee.setNic("933390268V");
//        employee.setTitle(Title.MR);
//        employee.setDateOfAssignment(LocalDate.now());
//        employeeService.persist(employee);
//
//        Role role = new Role();
//        role.setRoleName("MANAGER");
//        roleService.persist(role);
//
//        User user = new User();
//        user.setEmployee(employeeService.findById(1));
//        Set set = new HashSet(roleService.findAll());
//        user.setRoles(set);
//        user.setEnabled(true);
//        user.setUsername("Dilun");
//        user.setPassword("12345");
//        userService.persist(user);

        return userService.findById(1);
    }

}
