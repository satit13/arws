package init;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class serverTest {

	@Test
	public void test() throws SQLException {
		assertEquals(server.mainserver.getName(),"nebula");
		System.out.println(server.mainserver.getIp());
	}

}
