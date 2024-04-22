package com.example.demo.auto.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Avalability {
        
	    private boolean inStock;
	    @Id
	    private int quantity;

	    public Avalability(boolean inStock, int quantity) {
	        this.inStock = inStock;
	        this.quantity = quantity;
	    }

	    public boolean isInStock() {
	        return inStock;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

		@Override
		public String toString() {
			return "Avalability [inStock=" + inStock + ", quantity=" + quantity + "]";
		}
	    
	    
	    
	}


