package com.socgen.project1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {@javax.persistence.Id @GeneratedValue private String Id;
private String username;
private String email;
  public String getId() {
	return Id;
}
public void setId(String id) {
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
