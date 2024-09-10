package com.employeeCRUDAPI.com.employeeCRUDAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeCRUDAPI.com.employeeCRUDAPI.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
