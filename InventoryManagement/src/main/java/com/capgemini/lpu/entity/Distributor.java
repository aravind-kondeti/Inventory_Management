package com.capgemini.lpu.entity;

public class Distributor {
	
	private String distId;
	private String distName;
	private String distCity;
	private String distPhNum;
	
	public Distributor(String distId, String distName, String distCity, String distPhNum) {
		super();
		this.distId = distId;
		this.distName = distName;
		this.distCity = distCity;
		this.distPhNum = distPhNum;
	}

	public String getDistId() {
		return distId;
	}

	public String getDistName() {
		return distName;
	}

	public String getDistCity() {
		return distCity;
	}

	public String getDistPhNum() {
		return distPhNum;
	}

	@Override
	public String toString() {
		return "Distributor Id: " + distId + " Distributor Name: " + distName + 
				" Distributor location: " + distCity + " Contact Num: " + distPhNum;
	}
	
}
