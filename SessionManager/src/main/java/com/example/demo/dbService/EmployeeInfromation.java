package com.example.demo.dbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.EmployeeDetails;

@Repository
public class EmployeeInfromation {


    @Autowired
    private JdbcTemplate jdbcTemplate;

   
    public int save(EmployeeDetails details) {
        return jdbcTemplate.update(
                "insert into EmployeeDetails (EmployeeID,RequestID,Login Time price) values(?,?,?)",
                details.getEmployeeID(), details.getRequestID(),details.getLoginTime());
    }

   
    public int update(EmployeeDetails details) {
        return jdbcTemplate.update(
                "update EmployeeDetails set Logout TIme = ? where EmployeeID = ? and RequestID=?",
                details.getLogoutTime(), details.getEmployeeID(),details.getRequestID());
    }
   
}