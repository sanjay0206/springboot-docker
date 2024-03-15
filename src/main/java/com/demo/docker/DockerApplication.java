package com.demo.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
		System.out.println("Docker java app is running...");
	}


	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		return args -> {
			System.out.println("Coming here");
			List<Employee> employees = Arrays.asList(
					new Employee(1L, "John Doe", "Engineer"),
					new Employee(2L, "Jane Smith", "Manager"),
					new Employee(3L, "Michael Johnson", "Developer"),
					new Employee(4L, "Emily Davis", "Designer"),
					new Employee(5L, "Christopher Wilson", "Analyst")
			);

			employeeRepository.saveAll(employees);
		};
	}

}
