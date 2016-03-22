package view;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bean.bcar;
import controller.customerController;

public class customerTest {

	@Test
	public void testSearch() {
		List<bcar> result = new   ArrayList<bcar>();
		customerController req = new customerController();
		result = req.searchCustomer("56163");
		System.out.println("Name : "+ result.get(0).getName1()+"-- Code : "+result.get(0).getCode());
		 assertEquals(result.get(0).getCode(),"56163" );
	}

}
