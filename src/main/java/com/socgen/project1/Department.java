package com.socgen.project1;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Department {


	@javax.persistence.Id
	@GeneratedValue

	private int Id;
	
	private String name;
	
	public Department() {
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		name = name;
	}
}

