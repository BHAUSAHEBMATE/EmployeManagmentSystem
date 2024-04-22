package com.example.demo.auto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.auto.entity.Rating;
import com.example.demo.auto.entity.product;
import com.example.demo.auto.repo.repo;

@Component
public class method {

	@Autowired
	repo con;
	
	
public product inserts(product product) {
		


	product stds=this.con.save(product);
		
		return stds;
		
		
	}
	
	
	

public void Deletebyid(int id) {
	
	
	
			this.con.deleteById(id);

}
	


	public void update(product product) {
		
		
		
				this.con.save(product);
				
	}
	
	
	
 
	

	
   public List<product> fetchAll() {
		
	   List<product> product=  (List<com.example.demo.auto.entity.product>) this.con.findAll();
		
	   System.out.println(product);
		
		return 	   product;


	}


   public List<product> getbyId(int id) {
		
	   List<product> pr=    (List<product>) this.con.getbyid(id);
		
		
		return 	   pr;
	}

	
   
   

   
   
   
   
   
   
   
	
}
