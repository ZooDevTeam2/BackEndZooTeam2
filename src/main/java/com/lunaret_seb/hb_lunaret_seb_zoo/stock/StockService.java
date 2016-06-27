package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import java.util.ArrayList;
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

import zoo.enclos.Enclos;

//Definition of the root for all method uses in this class

@Path("/")
public class StockService {
	
	@Inject
	IStockManager stockManager;
	
	@GET
	@Path("/stocks")
	@Produces({ "application/json" })
	public List<Stock> getStocks(){
		//For the moment, the list is hard written, we need the DB now ...
		List<Stock> stockList = stockManager.findAll();
		return stockList;
	}
	
	@GET
	@Path("/stocks/{id}")
	@Produces({ "application/json" })
	public Stock detailStock(@PathParam("id") int id){
        Stock selectedStock = (Stock) stockManager.getByIndex(id);
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
