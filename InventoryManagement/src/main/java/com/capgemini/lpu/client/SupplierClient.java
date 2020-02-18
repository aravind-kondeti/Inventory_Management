package com.capgemini.lpu.client;

import java.util.Scanner;
import com.capgemini.lpu.service.InventoryService;
import com.capgemini.lpu.service.InventoryServiceImpl;
import com.capgmenini.lpu.exceptions.OrderException;
import com.capgmenini.lpu.exceptions.ValidateException;

public class SupplierClient {

	public static void main(String[] args) {
		
		
		InventoryService invser = new InventoryServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Suppliers Details are:");
		 System.out.println(invser.viewSupplierDetails());
		 
		 System.out.println("\nenter supplier Id: ");
		 int supId=sc.nextInt();
		 System.out.println("\nProducts supplied by supplier:");
		 
		 try {
			invser.getStockDetails(supId).forEach(System.out::println);
			} catch (ValidateException e) {
				System.out.println(e.getMessage());
			}
		
		 
		 
		 
		 
		 
		 
		 
//		 System.out.println("\nEnter order ID:");
//		 String ordid = sc.next();
//		 
//		 try {
//			invser.getOrderDetails(ordid).forEach(System.out::println);
//			} catch (OrderException e) {
//				System.out.println(e.getMessage());
//			}
//		 
//		 System.out.println("\nEnter Distributor ID:");
//		 String distid = sc.next();
//		 System.out.println("\nDistributor Details are:");
//		 invser.getDistributorDetails(distid).forEach(System.out::println);
		 
		 sc.close();
	}

}
