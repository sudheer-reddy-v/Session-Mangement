package com.example.demo.implementation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dbService.EmployeeInfromation;
import com.example.demo.pojo.EmployeeDetails;

@RestController
public class EmployeeSessionCaluclation {
	
	
	@Autowired
	EmployeeInfromation repo;
	
	Date date;
	
	@GetMapping("/login")
	public void Login(EmployeeDetails info) {
		date=new Date();
		info.setLoginTime(date.getTime());
		repo.save(info);
		
	}
	
	@GetMapping("/logout")
	public void logout(EmployeeDetails info) {
		date=new Date();
		info.setLogoutTime(date.getTime());
		repo.update(info);
		
	}

}
