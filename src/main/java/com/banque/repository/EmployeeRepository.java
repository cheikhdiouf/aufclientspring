package com.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.banque.model.Employee;
@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
