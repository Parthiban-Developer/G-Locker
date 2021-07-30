package com.locker.glock.dto;

import com.locker.glock.entity.DateAudit;

public class CustomerDto extends DateAudit{

	private Long id;
	
	private String name;

	private String mobile;

	private String email;

	private boolean isKYC;

	private String rewardPoints;

	private String otherProperties;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isKYC() {
		return isKYC;
	}

	public void setKYC(boolean isKYC) {
		this.isKYC = isKYC;
	}

	public String getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public String getOtherProperties() {
		return otherProperties;
	}

	public void setOtherProperties(String otherProperties) {
		this.otherProperties = otherProperties;
	}
	
}