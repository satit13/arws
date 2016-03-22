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
	
	
	public List<bcar> searchCustomer(String c){
		bcar cust = new bcar();
		List<bcar> custs = new ArrayList<bcar>();
		
		String Textstring = "select top 20 code,name1 from bcar where code like '%"+c+"%' or name1 like '%"+c+"%'";
		
		//System.out.println(Textstring);
		
		// get connection
					Statement stmt = null;
					try {
						stmt = ds.getStatement();
						System.out.println(Textstring);
						 ResultSet rs = stmt.executeQuery(Textstring);
						 String lccode = null;
						 while(rs.next()){
								cust.setCode(rs.getString("code"));
								cust.setName1(rs.getString("name1"));
								custs.add(cust);
							}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		return custs;
		
	}
}
