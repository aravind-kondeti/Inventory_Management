package com.capgemini.lpu.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.lpu.entity.Distributor;
import com.capgemini.lpu.entity.Order;

public class OrderRepo {
	
public static List<Order> getOrder(){ 
		
		List<Order> list = new ArrayList<>();
	
		Order ord1 = new Order("AH643J", 2579.32, 12, LocalDate.of(2020, 04, 18));
		Order ord2 = new Order("JL912I0", 12450.0, 6, LocalDate.of(2020, 03, 06));
		Order ord3 = new Order("HA231G", 65800.0, 20, LocalDate.of(2020, 02, 26));
		
		list.add(ord1);
		list.add(ord2);
		list.add(ord3);
		
		return list;
	}

public static List<Distributor> getDistributor(){ 
	
	List<Distributor> list = new ArrayList<>();

	Distributor dist1 = new Distributor("DG01", "Shiva Logistics", "Banglore", "9767498515");
	Distributor dist2 = new Distributor("DG02", "Surya Transport", "Hyderabad", "9573843883");
	Distributor dist3 = new Distributor("DG03", "Kiran Deliveries", "Vishakapatnam", "9534152612");
	
	list.add(dist1);
	list.add(dist2);
	list.add(dist3);
	
	return list;
}

}
