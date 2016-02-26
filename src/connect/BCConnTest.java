package connect;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class BCConnTest {
		private final BCConn ds = BCConn.INSTANCE;
		public String dbName = "bcnp";	
	@Test
	public void testConnectBCDb() throws SQLException {
		
		String Textstring = "select code from bcsale where code ='55001'";
		// get connection
					Statement stmt = null;
					try {
						stmt = ds.getStatement();
						System.out.println(Textstring);
						 ResultSet rs = stmt.executeQuery(Textstring);
					     assertEquals(rs.getString("code"),"55001" );
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				   
	}

}
