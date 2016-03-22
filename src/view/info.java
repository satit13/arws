package view;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;

//import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.versionInfo;;

@SuppressWarnings("unused")
@Path(value="/info")
public class info {
	@Path("/version") 
	@GET
	@Produces({MediaType.APPLICATION_JSON})

	public versionInfo  ver() throws IOException {

		versionInfo ver= new versionInfo();
		
		ver.setVersionId("25/02/2016 - AR Module");
		return ver;

	}

}
