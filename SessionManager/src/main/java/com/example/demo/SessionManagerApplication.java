package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dbService.EmployeeRepoitory;
import com.example.demo.pojo.EmployeeDetails;

@SpringBootApplication
public class SessionManagerApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepoitory repo;

	public static void main(String[] args) {
		SpringApplication.run(SessionManagerApplication.class, args);
	}
	
	@Override
    public void run(String... args) {

        EmployeeDetails det=(EmployeeDetails) repo.findUserByEmployeeID("1002");
        System.out.println("Employee ID "+det.getEmployeeID() +" Request ID "+det.getRequestID());
        
        EmployeeDetails det1=(EmployeeDetails) repo.findByEmployeeID("1002");
        System.out.println("Employee ID "+det1.getEmployeeID() +" Request ID "+det1.getRequestID());
        
    }

	
	
//	@Bean
//	JdbcTemplate getJDBCTemplate(){
//		return new JdbcTemplate();
//	}

}
