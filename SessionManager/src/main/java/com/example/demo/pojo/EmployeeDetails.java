package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class EmployeeDetails {

	@Id
	@Column(name="EMPLOYEEID")
	private String employeeID;
	@Column(name="REQUESTID")
	private String requestID;
	@Column(name="LOGINTIME")
	private long loginTime;
	@Column(name="LOGOUTTIME")
	private long logoutTime;
	
	public EmployeeDetails() {
		
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public long getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	public long getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(long logoutTime) {
		this.logoutTime = logoutTime;
	}
	
	
	
	
	
}
