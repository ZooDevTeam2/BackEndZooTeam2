package com.lunaret_seb.hb_lunaret_seb_zoo.animaux;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Animaux {

    private String name;
    private String specie;
    private Date dateOfBorn;
    private int id;
    
	public Animaux() {
	}

	public Animaux(String name, String specie, Date dateOfBorn, int id) {
		this.name = name;
		this.specie = specie;
		this.dateOfBorn = dateOfBorn;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public Date getDateOfBorn() {
		return dateOfBorn;
	}

	public void setDateOfBorn(Date dateOfBorn) {
		this.dateOfBorn = dateOfBorn;
	}

    
}
