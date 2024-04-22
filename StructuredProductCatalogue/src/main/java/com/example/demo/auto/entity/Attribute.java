package com.example.demo.auto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Attribute {

	@Id
	String size ;
	
	String color;
	
	String brand;
	
	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	public Attribute(String size, String color, String brand) {
		super();
		this.size = size;
		this.color = color;
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Attribute [size=" + size + ", color=" + color + ", brand=" + brand + "]";
	}
	
	
}
