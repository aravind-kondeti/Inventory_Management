package com.capgemini.lpu.dao;

import java.util.List;
import com.capgemini.lpu.entity.Distributor;
import com.capgemini.lpu.entity.Order;
import com.capgemini.lpu.entity.ProductStock;
import com.capgemini.lpu.entity.InvSupplier;

public interface InventoryDao {
	
	public List<InvSupplier> getSupplierDetails(); 
	public List<ProductStock> getStockDetails(int supId);
	//public List<Distributor> getDistributorDetails(String distId);
	//public List<Order> displayOrderDetails(String orderId);
}
