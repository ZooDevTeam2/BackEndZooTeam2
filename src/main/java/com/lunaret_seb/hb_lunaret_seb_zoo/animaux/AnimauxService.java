package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;


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
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/")
public class AnimauxService {

	//renvoi une liste de tout les animaux
	@Inject IAnimaux listAnimaux;

	@GET
	@Path("/animaux")
	@Produces({ "application/json" })
	public List<Animaux> listAnimaux() {

		return listAnimaux.getAll();
	}

	@GET
	@Path("/animaux/{id}")
	@Produces({ "application/json" })
	public Animaux detailAnimaux(@PathParam("id") int id) {
		
		Animaux selectedAnimaux = listAnimaux.getByIndex(id - 1);
		return selectedAnimaux;
	}

	@DELETE
	@Path("/animaux/delete/{id}")
	@Produces({ "application/json" })
	public Response deleteAnimaux(@PathParam("id") int id) {
		if (id < 4) {
			return Response.status(Status.OK).build();
		} else {
			return Response.status(Status.BAD_REQUEST).build();
		}
	}

	@POST
	@Path("/animaux/add")
	@Consumes({ "application/json" })
	public Response addAnimaux() {
		return Response.status(Status.CREATED).build();
	}

	@PUT
	@Path("/animaux/update")
	@Consumes({ "application/json" })
	public Response updateAnimaux() {
		return Response.status(Status.ACCEPTED).build();
	}
}
