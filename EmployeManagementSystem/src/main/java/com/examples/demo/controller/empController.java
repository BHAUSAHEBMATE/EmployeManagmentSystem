package com.examples.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.examples.demo.entity.employe;
import com.examples.demo.entity.methods;



@Controller
public class empController {

    @Autowired
	methods meth;
	
	
	
	@RequestMapping("/")
	public String home(Model model) {



		List<employe> data =this.meth.get(null);
		
		
		model.addAttribute("emp", data);

      	
		
		return "index";

	}

	
	@RequestMapping("addEmp")
	public String AddEmp() {

		System.out.println("index method is working");

		return "AddEmp";

	}

	

	
	@RequestMapping("/register")
	public String register(@ModelAttribute employe emp) {


		System.out.println("registet method");
   
 	   this.meth.insert(emp);

 	   return "redirect:/";
     
	}
	
	
	
	

	@RequestMapping("/home")
	public String Home(Model model) {

		System.out.println("home working");

		
		return "redirect:/";
	}
	
	


	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id,Model model ) {

		
		System.out.println(id);
		
		System.out.println("edit method id working");
		
		 Optional<employe> data  =this.meth.get(id);
		 
		 
		
		 model.addAttribute("emp", data.get());
		 
		 
		 
		 return "edits";
		
	}



	@RequestMapping("/update")
	public String update(@ModelAttribute employe emp) {

		System.out.println(emp);

		System.out.println("update method is working successfully");
   
 	   this.meth.insert(emp);

 	   return "redirect:/";
     
	}
	

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {


		
		System.out.println("delete method is working");
   
 	   this.meth.delete(id);

 	   return "redirect:/";
     
	}
	
	
}
