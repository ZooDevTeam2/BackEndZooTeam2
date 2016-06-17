package com.lunaret_seb.hb_lunaret_seb_zoo.stock;

import javax.xml.bind.annotation.XmlRootElement;

//XmlRootElement is necessary to use this java class for xlm root element in xlm forms

@XmlRootElement
public class Stock {
	private String name;
    private int quantities;
    private int maximum;
    private int id;
    
    //Empty constructor for the construction of xml
	public Stock() {
	}
    
	//Specific constructor for all other creation
	public Stock(String name, int quantities, int maximum, int id) {
		this.name = name;
		this.quantities = quantities;
		this.maximum = maximum;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantities() {
		return quantities;
	}
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
     
}
