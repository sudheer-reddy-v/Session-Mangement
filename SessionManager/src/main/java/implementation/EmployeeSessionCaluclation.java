package implementation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dbService.EmployeeInfromation;
import pojo.EmployeeDetails;

@Controller
public class EmployeeSessionCaluclation {
	
	
	@Autowired
	EmployeeInfromation repo;
	
	Date date;
	
	@RequestMapping("/login")
	public void Login(EmployeeDetails info) {
		date=new Date();
		info.setLoginTime(date.getTime());
		repo.save(info);
		
	}
	
	@RequestMapping("/logout")
	public void logout(EmployeeDetails info) {
		date=new Date();
		info.setLogoutTime(date.getTime());
		repo.update(info);
		
	}

}
