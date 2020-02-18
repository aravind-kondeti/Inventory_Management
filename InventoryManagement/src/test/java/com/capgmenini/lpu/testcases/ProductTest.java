package com.capgmenini.lpu.testcases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.lpu.service.InventoryService;
import com.capgemini.lpu.service.InventoryServiceImpl;
import com.capgmenini.lpu.exceptions.SupplierNotFound;

public class ProductTest {
	
private static InventoryService ser;
	
	@BeforeAll
	public static void beforeClass() {
		ser = new InventoryServiceImpl();
	}
	
	@Test
	public void testSupplier1() {
		assertTrue(ser.getStockDetails(supplierId).size()==2); 
	}
	
	@Test	
	public void testsearch1(){ 
		assertThrows(SupplierNotFound.class,()-> ser.);

	}

}
