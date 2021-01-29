package com.example.demo.model;

//import java.util.Arrays;

import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empid;
	private String name;
	private String address;
	/*public enum Gender
	{
		Male, Female;
	}*/
	private String gender;
	private int position;
	private double salary;
	private double value;
	//private double grosspay = salary-value;
	
	//int [] position= {1,2,3,4};
	
	//@Enumerated(EnumType.STRING)
	//private Gender gender;
	


	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

		public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	/*
	public double getGrosspay() {
		return grosspay;
	}

	public void setGrosspay(double grosspay) {
		this.grosspay = grosspay;
	}
	*/

			

	
	public String getGender() {
		return gender;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", position=" + position + ", salary=" + salary + ", value=" + value + "]";
	}

	

	
}
