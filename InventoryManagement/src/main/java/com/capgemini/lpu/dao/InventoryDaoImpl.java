package com.capgemini.lpu.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.capgemini.lpu.entity.Distributor;
import com.capgemini.lpu.entity.Order;
import com.capgemini.lpu.entity.ProductStock;
import com.capgemini.lpu.entity.InvSupplier;
import com.capgemini.lpu.repo.OrderRepo;
import com.capgemini.lpu.repo.Repository;

public class InventoryDaoImpl implements InventoryDao{
	
	private  List<InvSupplier> list = Repository.getSupplier();
	private Map<String, ProductStock> pmap = Repository.getStock();
	
	
	

	@Override
	public List<InvSupplier> getSupplierDetails() {
		List<InvSupplier> slist = new ArrayList<>();
		list.stream().forEach(supplier ->{
			slist.add(supplier);
		});
		return slist;
	}

	@Override
	public List<ProductStock> getStockDetails(int supid) {
		List<ProductStock> pslist = new ArrayList<>();
		pmap.values().stream().filter(pstock-> pstock.getSup() == supid)
		.forEach(prod->pslist.add(prod));
		return pslist;
	}

}
	//private  List<Distributor> dlist = OrderRepo.getDistributor();
		//private  List<Order> olist = OrderRepo.getOrder();
	
	//
//	@Override
//	public List<Distributor> getDistributorDetails(String distId) {
//		
//		List<Distributor> dlst = new ArrayList<>();
//		dlist.stream().filter(d->d.getDistId()== distId)
//		.forEach(dist->dlst.add(dist));
//		return dlst;
//	}
//
//	@Override
//	public List<Order> displayOrderDetails(String orderId) {
//		
//		List<Order> olst = new ArrayList<>();
//		olist.stream().filter(o->o.getOrderId() == orderId)
//		.forEach(order->olst.add(order));
//		return olst;
//	}
	

