package view;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import bean.bcar;
import controller.customerController;


@Path("/search")
public class customer {
	@Path("/customer/{varx}")	
	@GET

	//@Consumes({MediaType.TEXT_PLAIN})
	@Produces({MediaType.APPLICATION_JSON})
	public List<bcar> searchCustomer(@PathParam("varx")String c){
		List<bcar> result = new   ArrayList<bcar>();
		customerController Cus = new customerController();
		result = Cus.searchCustomer(c);
		System.out.println("Parameter is : "+c);
		
		return result;
	}
	
	

}
