package com.example.demo.dbService;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.EmployeeDetails;

public interface EmployeeRepoitory extends CrudRepository<EmployeeDetails, String> {
	
    EmployeeDetails findByEmployeeID(String name);
    
    @Query(value = "SELECT * FROM EMPLOYEES e WHERE e.EMPLOYEEID = :employeeID", nativeQuery = true)
    EmployeeDetails findUserByEmployeeID(String employeeID);
    
}
