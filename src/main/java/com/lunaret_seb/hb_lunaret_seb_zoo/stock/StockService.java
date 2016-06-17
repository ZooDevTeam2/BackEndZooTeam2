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

@Path("/")
public class StockService {
	
	@GET
	@Path("/stocks")
	@Produces({ "application/json" })
	public List<Stock> listStock(){
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
		List<Stock>listStock = new ArrayList<Stock>();
        listStock.add(new Stock("Carotte",300,500,1));
        listStock.add(new Stock("Viande",300,1000,2));
        listStock.add(new Stock("Poisson",120,700,3));
        
        Stock selectedStock = listStock.get(id-1);
        
		return selectedStock;
	}
	
	@DELETE
	@Path("/stocks/delete/{id}")
	@Consumes({ "application/json" })
	public Response deleteStock(@PathParam("id") int id){
		return Response.status(Status.ACCEPTED).build();
	}
	
//	@DELETE
//	@Path("/stocks/delete/")
//	@Consumes({ "application/json" })
//	public Response deleteStock(Entity E){
//		return Response.status(Status.ACCEPTED).build();
//	}
	
	@PUT
	@Path("/stocks/update/")
	@Consumes({ "application/json" })
	public Response updateStock(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}
	
	@POST
	@Path("/stocks/add/")
	@Produces({ "application/json" })
	public Response addStock(Entity E){
		return Response.status(Status.ACCEPTED).build();
	}
	
	
}
