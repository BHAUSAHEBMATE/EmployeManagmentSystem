package com.example.demo.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.auto.entity.product;
import com.example.demo.auto.service.method;

@RestController
public class controllerss {

	@Autowired
	method meth;
	
	
	@PostMapping("/create")
	public void insert(@RequestBody product product) {
		
		this.meth.inserts(product);
	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")int id ) {
		
		this.meth.Deletebyid(id);
		
	}
	
	

	@GetMapping("/getall/{id}")
	public List<product> getbyid(@PathVariable("id") int id ) {
		
		
		
		List<product> pr =this.meth.getbyId(id);
		
		return pr; 
	

	}
	

	@GetMapping("/getall")
	public List<product> getall() {
		
		return 	this.meth.fetchAll();

	}

	
	

	@PutMapping("/update")
	public product update(@RequestBody product product) {
		
		product pr = this.meth.inserts(product);
		return pr;
		
	}



	
	
	
	
	
}







