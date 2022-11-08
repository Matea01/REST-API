package com.developer.employeemanagement.repository;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//add anotation to confirm it is repo
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
