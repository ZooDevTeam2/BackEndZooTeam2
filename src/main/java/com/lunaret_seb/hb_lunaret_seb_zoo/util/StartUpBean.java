package com.lunaret_seb.hb_lunaret_seb_zoo.util;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

import com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock;
import com.lunaret_seb.hb_lunaret_seb_zoo.stock.StockDao;

@Singleton
@Startup
public class StartUpBean {
	
	private static final String MEASURE_DESIGNATION_TAXI_STATUS = "measure.designation.taxiStatus";
	
	private static final String MEASURE_ENUM_ENUM="measure.enum.enum";
	
	@Inject
	 StockDao stockDao;

	@PostConstruct
	public void init(){
		
		createStock("Poisson",70,500);
		createStock("Viande",80,700);
		createStock("Carottes",70,300);
		
	}

	private void createStock(String name, int quantities, int maximum) {
		Stock character = new Stock();
		character.setName(name);
		character.setQuantities(quantities);;
		character.setMaximum(maximum);;
		
		stockDao.persist(character);
		
	}

}
