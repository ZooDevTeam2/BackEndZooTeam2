package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import java.util.Collection;
import java.util.List;

public interface IStockManager{
	
	public Collection<Stock> getAll(); 

	public Stock getById(long id); 
	
	public void add(Stock stock); 

	public void modify(Stock stock); 

	public void delete(Stock stock); 

}
