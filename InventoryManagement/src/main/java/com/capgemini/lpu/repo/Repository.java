package com.capgemini.lpu.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.capgemini.lpu.entity.ProductStock;
import com.capgemini.lpu.entity.InvSupplier;

public class Repository {
	/**
	 * Creating a list of suppliers and adding them to the list.
	 */
	public static List<InvSupplier> getSupplier(){ 
		
		List<InvSupplier> list = new ArrayList<>();
	
		InvSupplier sup1 = new InvSupplier(1001, "Sivaji Enterprises", "Banglore", "9781989995");
		InvSupplier sup2 = new InvSupplier(1002, "Surya Enterprises", "Hyderabad", "9384857383");
		
		list.add(sup1);
		list.add(sup2);
		
		return list;
	}
	
	/**
	 * The below block contains different types of products each supplier supplies.
	 * @param sup1 
	 * @param sup2 
	 */
	
	public  static Map<String, ProductStock> getStock(){
		
		Map<String, ProductStock> smap = new HashMap<>();
		
		ProductStock prod1 =  new ProductStock("A784E", "Iron Bars", 1000, 500.0,"OK Tested",LocalDate.of(2016, 11, 12),1001);
		ProductStock prod2 =  new ProductStock("V114", "Steel Sheets", 1000, 1000.0,"OK Tested",LocalDate.of(2018, 12, 18),1001);
		ProductStock prod3 =  new ProductStock("J983", "Aluminium Rolls", 250, 2500.0,"OK Tested",LocalDate.of(2017, 03, 26),1001);
		ProductStock prod4 =  new ProductStock("J67N", "Chairs", 1000, 230.0,"OK Tested",LocalDate.of(2012, 05, 18),1001);
		ProductStock prod5 =  new ProductStock("RN98", "Paints", 670, 790.0,"OK Tested",LocalDate.of(2017, 02, 14),1001);
		ProductStock prod6 =  new ProductStock("II67", "Electric Boards", 10000, 200.0,"OK Tested",LocalDate.of(2018, 05, 24),1001);
		ProductStock prod7 =  new ProductStock("UV2E", "Electric Wires", 1000, 1000.0,"OK Tested",LocalDate.of(2017, 03, 22),1001);
		ProductStock prod8 =  new ProductStock("JG0N", "PVC Pipes", 7000, 940.0,"OK Tested",LocalDate.of(2018, 01, 12),1001);
		
		ProductStock prod9  =   new ProductStock("J89I", "Cement", 1000, 450.0,"OK Tested",LocalDate.of(2018, 01, 12),1002);
		ProductStock prod10 =  new ProductStock("G1G7", "Plaster of Paris", 1000, 1500.0,"OK Tested",LocalDate.of(2018, 05, 12),1002);
		ProductStock prod11 =  new ProductStock("R15V", "Steel Sheets", 500, 970.0,"OK Tested",LocalDate.of(2018, 03, 23),1002);
		ProductStock prod12 =  new ProductStock("F69T", "Motors", 750, 900.0,"OK Tested",LocalDate.of(2016, 01, 18),1002);
		ProductStock prod13 =  new ProductStock("LB09", "Chairs", 1200, 310.0,"OK Tested",LocalDate.of(2019, 06, 11),1002);
		ProductStock prod14 =  new ProductStock("E134R", "Paints", 780, 900.0,"OK Tested",LocalDate.of(2017, 04, 12),1002);
		ProductStock prod15 =  new ProductStock("Z12R", "Electric Wires", 1450, 1100.0,"OK Tested",LocalDate.of(2017, 02, 27),1002);
		ProductStock prod16 =  new ProductStock("B854", "Generators", 20, 50000.0,"OK Tested",LocalDate.of(2012, 01, 15),1002);
		
		smap.put(prod1.getProdId(), prod1);
		smap.put(prod2.getProdId(), prod2);
		smap.put(prod3.getProdId(), prod3);
		smap.put(prod4.getProdId(), prod4);
		smap.put(prod5.getProdId(), prod5);
		smap.put(prod6.getProdId(), prod6);
		smap.put(prod7.getProdId(), prod7);
		smap.put(prod8.getProdId(), prod8);
		smap.put(prod9.getProdId(), prod9);
		smap.put(prod10.getProdId(), prod10);
		smap.put(prod11.getProdId(), prod11);
		smap.put(prod12.getProdId(), prod12);
		smap.put(prod13.getProdId(), prod13);
		smap.put(prod14.getProdId(), prod14);
		smap.put(prod15.getProdId(), prod15);
		smap.put(prod16.getProdId(), prod16);
		
		return smap;
	}
}


	
