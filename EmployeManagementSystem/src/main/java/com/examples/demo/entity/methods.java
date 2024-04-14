package com.examples.demo.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class methods {
	
	@Autowired
	repo con;
	
	
	
	public void insert(employe emp) {
		
		this.con.save(emp);
		
		

	}
	
	
     public List<employe> get(employe emp) {
		
	
    	 List<employe> data =	(List<employe>) this.con.findAll();;
		
		
        return data;
	}

     
     
     
     
     

     public Optional<employe> get(int id ) {
		
	
    	 Optional<employe> data=this.con.findById(id);
    	
		return data;
		
		
     }

     public  employe delete(int id ) {
		
	
    	this.con.deleteById(id);
    	
		return null;
		
		
     }

     
     
     
     
}
