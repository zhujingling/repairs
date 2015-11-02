package com.ttrh.repairs.entity;

import java.util.Date;
import java.util.List;

public class User {
	private String UId;
	private String UName;
	private String UPwd;
	private String UEmail;
	private String USex;
	private String UPhone;
	private Date UCreateTime;
	private String UGroup;
	private String UDepartment;
	
	List<Repairs> repairs;

	public String getUId() {
		return UId;
	}

	public void setUId(String uId) {
		UId = uId;
	}

	public String getUName() {
		return UName;
	}

	public void setUName(String uName) {
		UName = uName;
	}

	public String getUPwd() {
		return UPwd;
	}

	public void setUPwd(String uPwd) {
		UPwd = uPwd;
	}

	public String getUEmail() {
		return UEmail;
	}

	public void setUEmail(String uEmail) {
		UEmail = uEmail;
	}

	public String getUSex() {
		return USex;
	}

	public void setUSex(String uSex) {
		USex = uSex;
	}

	public String getUPhone() {
		return UPhone;
	}

	public void setUPhone(String uPhone) {
		UPhone = uPhone;
	}

	
	public Date getUCreateTime() {
		return UCreateTime;
	}

	public void setUCreateTime(Date uCreateTime) {
		UCreateTime = uCreateTime;
	}



	public String getUGroup() {
		return UGroup;
	}

	public void setUGroup(String uGroup) {
		UGroup = uGroup;
	}

	public String getUDepartment() {
		return UDepartment;
	}

	public void setUDepartment(String uDepartment) {
		UDepartment = uDepartment;
	}

	public List<Repairs> getRepairs() {
		return repairs;
	}

	public void setRepairs(List<Repairs> repairs) {
		this.repairs = repairs;
	}
	
	
	
}
