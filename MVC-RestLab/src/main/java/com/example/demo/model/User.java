package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //This lets to work with the database
//Letting springboot to automatically create a db table based on fileds
public class User {
	@Id //To let know that uid is the Primary Key
	private int uid;
	private String name;
	private String nationality;
	
	public int getUid() {
		return uid;
	}
	
	//getters and setters
		//toString
		//will be used for returning Java Strings
	
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", nationality=" + nationality + "]";
	}
	
	

}
