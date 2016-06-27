package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.lunaret_seb.hb_lunaret_seb_zoo.jpa.StockDao;

@Stateless
public class StockManager implements IStockManager {

	@Inject
	private StockDao stockDao;
	
	private static List<Stock> stockList;

	@Override
	public Collection <Stock> getAll() {
		return stockDao.findAll();
	}

	@Override
	public Stock getById(long id) {
		 return stockDao.findById(id);
	}

	@Override
	public void add(Stock stock) {
	stockDao.persist(stock);
	}

	@Override
	public void modify(Stock stock) {
		stockDao.persist(stock);
	}
	@Override
	public void delete(Stock stock) {
		stockDao.remove(stock);
	}

	

}
