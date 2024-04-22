package com.example.demo.auto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rating {
	
	     @Id
	    private String userId;
	    private double rating;
	    private String comment;

	    public Rating(String userId, double rating, String comment) {
	        this.userId = userId;
	        this.rating = rating;
	        this.comment = comment;
	    }

	    public String getUserId() {
	        return userId;
	    }

	    public double getRating() {
	        return rating;
	    }

	    public String getComment() {
	        return comment;
	    }

		@Override
		public String toString() {
			return "Rating [userId=" + userId + ", rating=" + rating + ", comment=" + comment + "]";
		}
	    
	    
	    
}
