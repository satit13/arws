package init;

import java.sql.SQLException;

public enum server {
	
	mainserver;

	
		public String getName()throws SQLException{
			
			return "nebula";
		}
		
		public String getIp()throws SQLException{

			return "192.168.0.7";
		}
	
		
		
}