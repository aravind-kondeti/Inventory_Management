package com.capgemini.lpu.service;

import java.util.List;
import com.capgemini.lpu.entity.Distributor;
import com.capgemini.lpu.entity.Order;
import com.capgemini.lpu.entity.ProductStock;
import com.capgemini.lpu.entity.InvSupplier;
import com.capgmenini.lpu.exceptions.OrderException;
import com.capgmenini.lpu.exceptions.SupplierNotFound;
import com.capgmenini.lpu.exceptions.ValidateException;

public abstract interface InventoryService {

	public List<InvSupplier> viewSupplierDetails(); 
	public List<ProductStock> getStockDetails(int supplierId) throws ValidateException;
	public InvSupplier viewSupplierDetails(int supplierId) throws SupplierNotFound;
	//public List<Order> getOrderDetails(String orderId) throws OrderException;
	//public List<Distributor> getDistributorDetails(String distId);
	
}
