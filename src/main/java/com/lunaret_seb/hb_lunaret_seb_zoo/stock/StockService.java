package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class StockService {
	
	@GET
	@Path("/stock")
	public String listStock(){
		return "La liste de stock";
	}
}
