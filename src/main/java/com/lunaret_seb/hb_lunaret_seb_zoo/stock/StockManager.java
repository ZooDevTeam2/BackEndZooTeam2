package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

@Stateful
public class StockManager implements IStock {

	private static List<Stock> stockList;

	public static List<Stock> getStockList() {
		return stockList;
	}

	public static void setStockList(List<Stock> newStockList) {
		stockList = newStockList;
	}

	public StockManager() {
		stockList = new ArrayList<Stock>();
		stockList.add(new Stock("Carotte",300,500,1));
		stockList.add(new Stock("Viande",300,1000,2));
		stockList.add(new Stock("Poisson",120,700,3));
	}
	
	
	@Override
	public Object getByIndex(int index) {
		Stock selectedStock = stockList.get(index-1);
        //-1 is used in this case to put in the same specification
        //the index in the list (0 to infinite) and the id (1 to infinite)
        //number to the same level
		return selectedStock;
	}

	@Override
	public List getAll() {
		return stockList;
	}

	@Override
	public void add(Object obj) {	
	}

	@Override
	public void update(Object obj, int position) {

	}

	@Override
	public void remove(int position) {

	}

}
