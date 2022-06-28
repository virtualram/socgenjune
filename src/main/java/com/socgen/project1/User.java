package com.socgen.project1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User {@javax.persistence.Id @GeneratedValue
	private Integer Id;
	private String username;
	private String email;
	@ManyToMany(targetEntity=Skills.class)
	
	private List skills;
	
	
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	@OneToOne
	private Department dept;
	
  public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
