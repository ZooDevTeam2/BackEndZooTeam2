package com.lunaret_seb.hb_lunaret_seb_zoo.util;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Ressources {
	
	@PersistenceContext
	@Produces
	private EntityManager em;
	
	@Produces
	public Logger produceLog(InjectionPoint injectionPoint){
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}

}
