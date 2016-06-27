package com.lunaret_seb.hb_lunaret_seb_zoo.stock;


import javax.ejb.Stateful;

import com.lunaret_seb.hb_lunaret_seb_zoo.JpaDao;

@Stateful
public class JpaStockDoa extends JpaDao <Long, Stock> implements StockDao {


}
