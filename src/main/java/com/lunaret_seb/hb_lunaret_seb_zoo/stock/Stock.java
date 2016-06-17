package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

public class Stock {
	private String name;
    private int quantities;
    private int maximum;
    private int id;
    
	public Stock(String name, int quantities, int maximum, int id) {
		this.name = name;
		this.quantities = quantities;
		this.maximum = maximum;
		this.id = id;
	}
	@Override
	public String toString() {
		return name+" ("+quantities+")";
	}

	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getQuantities() {
		return quantities;
	}
	private void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	private int getMaximum() {
		return maximum;
	}
	private void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
     
}
