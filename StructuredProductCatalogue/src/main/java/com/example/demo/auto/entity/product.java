package com.example.demo.auto.entity;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class product {

	@Id
	    private String id;
	    private String name;
	    private String description;
	    private double price;
	    private String categories;
	    
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    private Attribute attributes;
	    
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    private Avalability availability;
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    private Rating ratings;

	    
	
	
public product() {
	// TODO Auto-generated constructor stub
}




public product(String id, String name, String description, double price, String categories, Attribute attributes,
		Avalability availability, Rating ratings) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.categories = categories;
	this.attributes = attributes;
	this.availability = availability;
	this.ratings = ratings;
}




public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getDescription() {
	return description;
}




public void setDescription(String description) {
	this.description = description;
}




public double getPrice() {
	return price;
}




public void setPrice(double price) {
	this.price = price;
}




public String getCategories() {
	return categories;
}




public void setCategories(String categories) {
	this.categories = categories;
}




public Attribute getAttributes() {
	return attributes;
}




public void setAttributes(Attribute attributes) {
	this.attributes = attributes;
}




public Avalability getAvailability() {
	return availability;
}




public void setAvailability(Avalability availability) {
	this.availability = availability;
}




public Rating getRatings() {
	return ratings;
}




public void setRatings(Rating ratings) {
	this.ratings = ratings;
}




@Override
public String toString() {
	return "product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
			+ ", categories=" + categories + ", attributes=" + attributes + ", availability=" + availability
			+ ", ratings=" + ratings + "]";
}





	
	}
