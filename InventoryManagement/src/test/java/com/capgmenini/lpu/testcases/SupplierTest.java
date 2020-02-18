package com.capgmenini.lpu.testcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.capgemini.lpu.service.InventoryService;
import com.capgemini.lpu.service.InventoryServiceImpl;

public class SupplierTest {
	private static InventoryService ser;
	
	@BeforeAll
	public static void beforeClass() {
		ser = new InventoryServiceImpl();
	}
	
	
	@Test
	public void testSupplier1() {
		assertTrue(ser.viewSupplierDetails().size()==2); 
	}
	
}
