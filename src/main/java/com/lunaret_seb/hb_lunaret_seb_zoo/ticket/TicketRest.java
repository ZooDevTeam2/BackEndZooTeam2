package com.lunaret_seb.hb_lunaret_seb_zoo.ticket;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
public class TicketRest {
	
	@Inject 
	ITicket DB;
	
	@GET
	@Path("/tickets")
	@Produces({ "application/json" })
	public List<Ticket> getTicket() {
		return DB.getAll();
	}
	
	@GET
	@Path("/tickets/{id}")
	@Produces({ "application/json" })
	public Ticket getTicketByIndex(@PathParam("id") int id) {
		return DB.getByIndex(id);
	}
	
	@DELETE
	@Path("/tickets/delete/{id}")
	@Produces("application/json")
	public Response deleteTicket(@PathParam("id") int id) {
		DB.remove(id);
		List<Ticket> wrapThis = DB.getAll();
		return Response.status(200).entity(wrapThis).build();
	}
	
//	@PUT
//	@Path("/tickets/update/")
//	@Consumes("application/json")
//	@Produces("application/json")
//	public Response updateTicket(Ticket ticket, @PathParam("id") int id){
//		DB.update(ticket, id);
//		List<Ticket> wrapThis = DB.getAll();
//		return Response.status(200).entity(wrapThis).build();
//	}
	
	@POST
	@Path("/tickets/add/")
	@Consumes("application/json")
	@Produces("application/json")
	public Response addTicket(Ticket ticket){
		DB.add(ticket);;
		List<Ticket> wrapThis = DB.getAll();
		return Response.status(200).entity(wrapThis).build();
	}

}
