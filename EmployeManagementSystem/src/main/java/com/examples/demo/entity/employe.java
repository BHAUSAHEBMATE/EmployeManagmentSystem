package com.examples.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class employe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	
	String name;
	String address;
	String email;
	String phoneno;
	String salary;
	
	
	
	
	
	
	public employe() {
		// TODO Auto-generated constructor stub
	}






	public employe(int id, String name, String address, String email, String phoneno, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneno = phoneno;
		this.salary = salary;
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






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getPhoneno() {
		return phoneno;
	}






	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}






	public String getSalary() {
		return salary;
	}






	public void setSalary(String salary) {
		this.salary = salary;
	}






	@Override
	public String toString() {
		return "employe [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phoneno="
				+ phoneno + ", salary=" + salary + "]";
	}



}

