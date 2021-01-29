package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int uid;
@Column(nullable=false) private String name;
private String nationality;
public int getUid() {
	return uid;
}
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
