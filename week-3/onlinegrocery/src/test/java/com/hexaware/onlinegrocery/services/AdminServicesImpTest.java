package com.hexaware.onlinegrocery.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.onlinegrocery.entity.Admin;

class AdminServicesImpTest {
	AdminServicesImp b=new AdminServicesImp();
	@Test
	void testCreateAdmin() {
		Admin obj=new Admin();
		assertEquals(1,b.createAdmin(obj));
	}
	@Test
	void testGetAllAdmin() {
		List<Admin> actual=b.getAllAdmin();
		List<Admin> expected=new ArrayList<Admin>();
		expected.add(new Admin(14,"himakar","HI@43"));
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testupdateAdmin() {
		Admin admin=new Admin();
		
		assertEquals(1, b.updateAdmin(admin));
	}
	@Test
	public void deleteAdmin() {
		assertEquals(1, b.deleteAdmin(1));
	}
	@Test
	public void getAdmin() {
		Admin actual=b.getAdmin(1);
		Admin expected=new Admin();
		assertEquals(expected, actual);
	}
	

		
}

	

