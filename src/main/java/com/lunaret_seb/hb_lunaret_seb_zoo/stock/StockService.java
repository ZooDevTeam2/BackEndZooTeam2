package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import java.util.ArrayList;
import java.util.List;

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

//Definition of the root for all method uses in this class

@Path("/")
public class StockService {
	
	@GET
	@Path("/stocks")
	@Produces({ "application/json" })
	public List<Stock> listStock(){
		//For the moment, the list is hard written, we need the DB now ...
		List<Stock>listStock = new ArrayList<Stock>();
        listStock.add(new Stock("Carotte",300,500,1));
        listStock.add(new Stock("Viande",300,1000,2));
        listStock.add(new Stock("Poisson",120,700,3));
		return listStock;
	}
	
	@GET
	@Path("/stocks/{id}")
	@Produces({ "application/json" })
	public Stock detailStock(@PathParam("id") int id){
		//@PathParam is used to be able to add the last part of the url as a
		//paramter of the method
		//For the moment, the list is hard written, we need the DB now ...
		List<Stock>listStock = new ArrayList<Stock>();
        listStock.add(new Stock("Carotte",300,500,1));
        listStock.add(new Stock("Viande",300,1000,2));
        listStock.add(new Stock("Poisson",120,700,3));
        
        Stock selectedStock = listStock.get(id-1);
        //-1 is used in this case to put in the same specification
        //the index in the list (0 to infinite) and the id (1 to infinite)
        //number to the same level
        
		return selectedStock;
	}
		
	@DELETE
	@Path("/stocks/delete/")
	@Consumes({ "application/json" })
	public Response deleteStock(Entity E){
		//Entity is used as parameter to create a generic approach of the method
		// that need a json or xml which define a specific Objet in Java
		return Response.status(Status.ACCEPTED).build();
	}
	
	@PUT
	@Path("/stocks/update/")
	@Consumes({ "application/json" })
	public Response updateStock(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}
	
	@POST
	@Path("/stocks/add/")
	@Consumes({ "application/json" })
	public Response addStock(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}
	
	
}
