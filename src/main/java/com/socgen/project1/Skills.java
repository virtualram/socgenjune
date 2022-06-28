package com.socgen.project1;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity

public class Skills {
	@javax.persistence.Id
	@GeneratedValue

	private int Id;
	
	private String Name;
	@ManyToMany(targetEntity=User.class)

	private List user;
	
	

	public List getUser() {
		return user;
	}

	public void setUser(List user) {
		this.user = user;
	}

	public Skills() {
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	

	
}
