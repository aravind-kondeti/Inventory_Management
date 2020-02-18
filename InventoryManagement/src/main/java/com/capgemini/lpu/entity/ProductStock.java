package com.capgemini.lpu.entity;

import java.time.LocalDate;

public class ProductStock {
	private String prodId;
	private String prodName;
	private int prodStockQty;
	private double prodPrice;
	private String quaCheck;
	private LocalDate mfgDate;
	private int sup;
	
	public ProductStock(String prodId, String prodName, int prodStockQty, double prodPrice, String quaCheck,
			LocalDate mfgDate, int sup) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodStockQty = prodStockQty;
		this.prodPrice = prodPrice;
		this.quaCheck = quaCheck;
		this.mfgDate = mfgDate;
		this.sup = sup;
	}

	public String getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public int getProdStockQty() {
		return prodStockQty;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public String getQuaCheck() {
		return quaCheck;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public int getSup() {
		return sup;
	}

	public void setProdStockQty(int prodStockQty) {
		this.prodStockQty = prodStockQty;
	}
	
	@Override
	public String toString() {
		return " Product Id: " + prodId + " Product Name: " + prodName + 
				" Price: " + prodPrice + " STock Quantity: " + prodStockQty;
	}
}
