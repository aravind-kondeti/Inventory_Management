package com.capgemini.lpu.entity;

public class InvSupplier {
	
	private int supId;
	private String supName;
	private String supCity;
	private String supPhn;
	
	public InvSupplier(int supId, String supName, String supCity, String supPhn) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.supCity = supCity;
		this.supPhn = supPhn;
	}

	public int getSupId() {
		return supId;
	}

	public String getSupName() {
		return supName;
	}

	public String getSupCity() {
		return supCity;
	}

	public String getSupPhn() {
		return supPhn;
	}

	@Override
	public String toString() {
		return "Supplier Id: " + supId + " Supplier Name: " + supName + 
				" Supplier location: " + supCity + " Contact Num: " + supPhn;
	}

}
