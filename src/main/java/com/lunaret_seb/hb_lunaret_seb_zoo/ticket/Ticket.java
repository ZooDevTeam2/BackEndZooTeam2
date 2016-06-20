package com.lunaret_seb.hb_lunaret_seb_zoo.ticket;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	
	private String name;
    private double price;
    private int id;
    
    // Constructors
    public Ticket() {
		super();
	}
	public Ticket(String name, double price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    

}
