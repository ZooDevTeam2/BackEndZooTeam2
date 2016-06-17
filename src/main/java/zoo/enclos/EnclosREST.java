package zoo.enclos;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class EnclosREST {
	@GET
	@Path("/Enclos")
	@Produces({ "application/json" })
	public Response getEnclos() {
		List<Enclos> wrapThis = DB.getInstance().getAll();
		return Response.status(200).entity(wrapThis).build();
	}

	@GET
	@Path("/Enclos/{id}")
	@Produces({ "application/json" })
	public Response getEnclosById(@PathParam("id") int id) {
		Enclos wrapThis = DB.getInstance().getByIndex(id);
		return Response.status(200).entity(wrapThis).build();
	}

	
	@POST
	@Path("/Enclos/add")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addEnclos(Enclos Obj) {
		DB.getInstance().add(Obj);
		List<Enclos> wrapThis = DB.getInstance().getAll();
		return Response.status(200).entity(wrapThis).build();
	}
	
	@PUT
	@Path("/Enclos/update/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateEnclos(Enclos Obj,@PathParam("id") int id ) {
		DB.getInstance().update(Obj, id);
		List<Enclos> wrapThis = DB.getInstance().getAll();
		return Response.status(200).entity(wrapThis).build();
	}
	
	@DELETE
	@Path("/Enclos/delete/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response deleteEnclos(@PathParam("id") int id ) {
		DB.getInstance().remove(id);
		List<Enclos> wrapThis = DB.getInstance().getAll();
		return Response.status(200).entity(wrapThis).build();
	}
}