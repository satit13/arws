package view;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import bean.bcar;
import controller.customerController;

public class customerTest {

	@Test
	@Ignore
	public void testSearch() {
		List<bcar> result = new   ArrayList<bcar>();
		customerController req = new customerController();
		result = req.searchCustomer("56163");
		System.out.println("Name : "+ result.get(0).getName1()+"-- Code : "+result.get(0).getCode());
		 assertEquals(result.get(0).getCode(),"56163" );
	}
	
	
	@Test
//	@Ignore
	public void testAdd(){
		bcar newCust = new bcar();
		newCust.setCode("test");
		newCust.setName1("satit test");
		
		customerController req = new customerController();
		bean.response result = new bean.response();
		result = req.InsertCustomer(newCust);
		
		assertEquals(result.isSuccess(),true);
		
	}


	@Test
	@Ignore
	public void testDelete(){
		String c = "test";
		
		customerController req = new customerController();
		bean.response result = new bean.response();
		result = req.RemoveCustomer(c);
		
		assertEquals(result.isSuccess(),true);
		
	}
	
	@Test
//	@Ignore
	public void testUpdate(){
		bcar newCust = new bcar();
		newCust.setCode("test");
		newCust.setName1("satit fix name1");
		
		customerController req = new customerController();
		bean.response result = new bean.response();
		result = req.updateCustomer(newCust);
		
		assertEquals(result.isSuccess(),true);
		
	}

}
