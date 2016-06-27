package com.lunaret_seb.hb_lunaret_seb_zoo.jpa;

import javax.ejb.Stateful;

import com.lunaret_seb.hb_lunaret_seb_zoo.stock.Stock;


public class JpaStockDao extends JpaDao <Long, Stock> implements StockDao {


}
