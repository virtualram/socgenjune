package com.socgen.project1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User {@javax.persistence.Id @GeneratedValue
	private Integer Id;
	private String username;
	private String email;
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
