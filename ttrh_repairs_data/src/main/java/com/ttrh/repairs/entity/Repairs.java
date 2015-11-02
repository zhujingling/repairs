package com.ttrh.repairs.entity;

import java.util.Date;

public class Repairs {
	private String reparisId;
	private String reparisNumber;// 报修单号
	private Date reparisTime;// 报修时间
	private String reparisUser;// 报修人
	private boolean reparisIs;// 是否已修好

	private User user;

	public String getReparisId() {
		return reparisId;
	}

	public void setReparisId(String reparisId) {
		this.reparisId = reparisId;
	}

	public String getReparisNumber() {
		return reparisNumber;
	}

	public void setReparisNumber(String reparisNumber) {
		this.reparisNumber = reparisNumber;
	}

	public Date getReparisTime() {
		return reparisTime;
	}

	public void setReparisTime(Date reparisTime) {
		this.reparisTime = reparisTime;
	}

	public String getReparisUser() {
		return reparisUser;
	}

	public void setReparisUser(String reparisUser) {
		this.reparisUser = reparisUser;
	}

	public boolean isReparisIs() {
		return reparisIs;
	}

	public void setReparisIs(boolean reparisIs) {
		this.reparisIs = reparisIs;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
