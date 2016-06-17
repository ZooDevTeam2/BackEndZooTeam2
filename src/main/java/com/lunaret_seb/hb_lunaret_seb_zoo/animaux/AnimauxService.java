package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/")
public class AnimauxService {

	@GET
	@Path("/animaux")
	@Produces({ "application/json" })
	public List<Animaux> listAnimaux() {
		List<Animaux> listAnimaux = new ArrayList<Animaux>();
		listAnimaux.add(new Animaux("kiki", "mouse", new Date("2016/05/05"), 1));
		listAnimaux.add(new Animaux("mimi", "rat", new Date("2016/04/25"), 2));
		listAnimaux.add(new Animaux("rififi", "capibara", new Date("2015/05/05"), 3));

		return listAnimaux;
	}

	@GET
	@Path("/animaux/{id}")
	@Produces({ "application/json" })
	public Animaux detailAnimaux(@PathParam("id") int id) {

		List<Animaux> listAnimauxForDetail = new ArrayList<Animaux>();
		listAnimauxForDetail.add(new Animaux("kiki", "mouse", new Date("2016/05/05"), 1));
		listAnimauxForDetail.add(new Animaux("mimi", "rat", new Date("2016/04/25"), 2));
		listAnimauxForDetail.add(new Animaux("rififi", "capibara", new Date("2015/05/05"), 3));

		Animaux selectedAnimaux = listAnimauxForDetail.get(id - 1);
		return selectedAnimaux;
	}

	@DELETE
	@Path("/animaux/delete/{id}")
	@Produces({ "application/json" })
	public Response deleteAnimaux(@PathParam("id") int id) {
		if (id < 4) {
			return Response.status(Status.OK).build();
		}else {
			return Response.status(Status.BAD_REQUEST).build();
		}
	}

	@POST
	@Path("/animaux/add")
	@Consumes({ "application/json" })
	public Response addAnimaux() {
		// System.out.println("ok");
		return Response.status(Status.CREATED).build();
	}

}
