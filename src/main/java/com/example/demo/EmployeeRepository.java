package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Declare interface that extends Spring Data JPA's JpaRepository
// Domain type as Employee
// id type as Long
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
