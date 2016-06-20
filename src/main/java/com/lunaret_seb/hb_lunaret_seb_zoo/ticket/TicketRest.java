package com.lunaret_seb.hb_lunaret_seb_zoo.ticket;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.client.Entity;

@Path("/")
public class TicketRest {
	
	@GET
	@Path("/tickets")
	@Produces({ "application/json"})
	public List<Ticket> listTicket(){
		List<Ticket>listTicket = new ArrayList<Ticket>();
		listTicket.add(new Ticket("Tarif normal", 8, 1));
		listTicket.add(new Ticket("Tarif réduit", 6, 2));
		listTicket.add(new Ticket("Tarif enfant", 5, 3));
		listTicket.add(new Ticket("Tarif carnet 10", 65, 4));
		listTicket.add(new Ticket("Tarif groupe adultes", 55, 5));
		listTicket.add(new Ticket("Tarif groupe scolaire", 80, 6));
		listTicket.add(new Ticket("Tarif groupe étudiant", 85, 7));
		return listTicket;
	}
	
	@GET
	@Path("/tickets/{id}")
	@Produces({ "application/json"})
	public Ticket detailTicket(@PathParam("id") int id) {
		List<Ticket>listTicket = new ArrayList<Ticket>();
		listTicket.add(new Ticket("Tarif normal", 8, 1));
		listTicket.add(new Ticket("Tarif réduit", 6, 2));
		listTicket.add(new Ticket("Tarif enfant", 5, 3));
		listTicket.add(new Ticket("Tarif carnet 10", 65, 4));
		listTicket.add(new Ticket("Tarif groupe adultes", 55, 5));
		listTicket.add(new Ticket("Tarif groupe scolaire", 80, 6));
		listTicket.add(new Ticket("Tarif groupe étudiant", 85, 7));

		
		Ticket selectedTicket = listTicket.get(id-1);
		return selectedTicket;
	}
	
	@DELETE
	@Path("/tickets/delete/")
	@Consumes({ "application/json" })
	public Response deleteTicket(Entity E) {
		return Response.status(Status.ACCEPTED).build();
	}
	
	@PUT
	@Path("/tickets/update/")
	@Consumes({ "application/json"})
	public Response updateTicket(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}
	
	@POST
	@Path("/tickets/add/")
	@Consumes({ "application/json"})
	public Response addTicket(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}

}
