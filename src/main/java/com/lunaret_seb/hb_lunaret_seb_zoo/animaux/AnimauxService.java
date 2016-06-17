package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
}
