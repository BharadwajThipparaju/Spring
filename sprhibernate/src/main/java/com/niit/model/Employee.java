package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Employee 
{
	
@Id
@GeneratedValue
@Column
	private Integer id;
	private String Name;
	private String country;
public Employee(){
	
}
public Employee(Integer id, String name, String country){
	this.id = id;
	this.Name = name;
	this.country = country;
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	
}