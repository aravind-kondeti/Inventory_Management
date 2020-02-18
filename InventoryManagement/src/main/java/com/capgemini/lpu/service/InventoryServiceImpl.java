package com.capgemini.lpu.service;

import java.util.List;
import com.capgemini.lpu.dao.InventoryDao;
import com.capgemini.lpu.dao.InventoryDaoImpl;
import com.capgemini.lpu.entity.Distributor;
import com.capgemini.lpu.entity.Order;
import com.capgemini.lpu.entity.ProductStock;
import com.capgemini.lpu.entity.InvSupplier;
import com.capgmenini.lpu.exceptions.OrderException;
import com.capgmenini.lpu.exceptions.SupplierNotFound;
import com.capgmenini.lpu.exceptions.ValidateException;


public class InventoryServiceImpl implements InventoryService {
	
	private InventoryDao dao = new InventoryDaoImpl();

	@Override
	public List<InvSupplier> viewSupplierDetails() {
		return dao.getSupplierDetails();
	}

	@Override
	public List<ProductStock> getStockDetails(int supId) throws ValidateException{
		
		if(supId < 1000 && supId > 1002)
			throw new ValidateException("Supplier Not Found");
			return dao.getStockDetails(supId);
	}

	@Override
	public InvSupplier viewSupplierDetails(int supplierId) throws SupplierNotFound {
		InvSupplier supplier = dao.getSupplierDetails().stream()
				.filter(supp->supp.getSupId()==supplierId).findFirst().get();
		if(supplier == null)
			throw new SupplierNotFound();
		return supplier;
	}

//	@Override
//	public List<Order> getOrderDetails(String orderId) throws OrderException{
//		if(!dao.equals(orderId))
//			throw new OrderException("Order not found");
//		return dao.displayOrderDetails(orderId);
//	}
//
//	@Override
//	public List<Distributor> getDistributorDetails(String distId) {
//		
//		return dao.getDistributorDetails(distId);
//	}

}
