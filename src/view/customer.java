package view;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import bean.bcar;
import controller.customerController;


@Path("/customer")
public class customer {
	@Path("/search/{varx}")	
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
	
	
	@Path("/add")	
	@POST

	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public bean.response insertCustomer(bcar r){
		bean.response result = new bean.response();
		
		customerController Cus = new customerController();
		result = Cus.InsertCustomer(r);
		System.out.println("Parameter is : "+r.getCode()+" name : "+r.getName1());
		
		return result;
	}
	
	
	@Path("/delete/{code}")	
	@POST

	//@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public bean.response deleteCustomer(@PathParam("code") String r){
		bean.response result = new bean.response();
		
		customerController Cus = new customerController();
		result = Cus.RemoveCustomer(r);
		System.out.println("Parameter is : "+r+" name : "+r);
		
		return result;
	}

	
	@Path("/update")	
	@POST

	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public bean.response updateCustomer(bcar r){
		bean.response result = new bean.response();
		
		customerController Cus = new customerController();
		result = Cus.updateCustomer(r);
		System.out.println("Parameter is : "+r.getCode()+" name : "+r.getName1());
		
		return result;
	}
		
	
}
