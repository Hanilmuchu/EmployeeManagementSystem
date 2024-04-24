package com.hanil.repo;

import org.springframework.data.repository.CrudRepository;

import com.hanil.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
