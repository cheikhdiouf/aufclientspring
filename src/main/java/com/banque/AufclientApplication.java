package com.banque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.banque.model.Employee;
import com.banque.repository.EmployeeRepository;

@SpringBootApplication
public class AufclientApplication{
@Autowired
 EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(AufclientApplication.class, args);
	}

	
}
