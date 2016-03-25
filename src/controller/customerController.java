package controller;
import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.bcar;
import bean.response;
import connect.BCConn;
public class customerController {

	private final BCConn ds = BCConn.INSTANCE;
	public String dbName = "bcnp";	
	
	// Search Customer by Keyword "code" , "name1"
	public List<bcar> searchCustomer(String c){
		bcar cust = new bcar();
		List<bcar> custs = new ArrayList<bcar>();
		
		String Textstring = "select top 20 code,name1 from bcar where code like '%"+c+"%' or name1 like '%"+c+"%' order by code";
		
		//System.out.println(Textstring);
		
		// get connection
					Statement stmt = null;
					try {
						stmt = ds.getStatement();
						System.out.println(Textstring);
						 ResultSet rs = stmt.executeQuery(Textstring);
						 String lccode = null;

						 custs.clear();
						 while(rs.next()){
							 	bcar cust1 = new bcar();
								cust1.setCode(rs.getString("code"));
								cust1.setName1(rs.getString("name1"));
								custs.add(cust1);
								System.out.println(rs.getString("name1"));
							}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		return custs;
		
	}
	
	public response InsertCustomer(bcar c){
		
		// Define Reponse Format from Bean Response
		bean.response result = new bean.response();
		result.setDesc("Insert new Record");
		 
		String Textstring = "insert into  bcar(code,name1) values('"+c.getCode()+"','"+c.getName1()+"')";
		System.out.println(Textstring);
		
		
		// get connection
					Statement stmt = null;
					try {

						stmt = ds.getStatement();
						System.out.println(Textstring);
						// ResultSet rs = stmt.executeQuery(Textstring);
						 int rs = stmt.executeUpdate(Textstring);
						 System.out.println(rs);
							 result.setSuccess(true);
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						 result.setSuccess(false);
						 
							
					}
		return result;
		
	}
		
	
	
	
	// Delete Customer 
	// check existing transaction sale if exists do not deleted..!!!
	
	public response RemoveCustomer(String c){
		
		// Define Reponse Format from Bean Response
		bean.response result = new bean.response();
		result.setDesc("Remove new Record");
		 
		
		//check มีประวัติการทำรายการ   true = มีรายการค้างอยู่
		Boolean r = this.canDelete(c);
		
		if (r == true){
			result.setSuccess(false);
		} else {
			
			String Textstring = "delete bcar where code = '"+c+"'";
		System.out.println(Textstring);
		
					Statement stmt = null;
					try {
						stmt = ds.getStatement();
						System.out.println(Textstring);
						 int rs = stmt.executeUpdate(Textstring);
						 System.out.println(rs);
						 result.setSuccess(true);
						
					} catch (SQLException e) {
						e.printStackTrace();
						result.setSuccess(false);
						 
							
					}
		}
		
		return result;
		
	}

	// Delete Customer 
		// check existing transaction sale if exists do not deleted..!!!
		
		public response updateCustomer(bcar c){
			
			// Define Reponse Format from Bean Response
			bean.response result = new bean.response();
			result.setDesc("Update new Record");
			 

			
			String Textstring = "update bcar set name1 = '"+c.getName1()+"'where code = '"+c.getCode()+"'";
			System.out.println(Textstring);
			
						Statement stmt = null;
						try {
							stmt = ds.getStatement();
							System.out.println(Textstring);
							 int rs = stmt.executeUpdate(Textstring);
							 System.out.println(rs);
							 result.setSuccess(true);
							
						} catch (SQLException e) {
							e.printStackTrace();
							result.setSuccess(false);
							 
								
						}
			
			
			return result;
			
		}
	
	
	
	private Boolean canDelete(String c) {
		// TODO Auto-generated method stub
		return false;
	}
		
}
