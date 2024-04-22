package com.example.demo.auto.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.auto.entity.product;
@Repository
public interface repo extends CrudRepository<product,String> {

	
	
	@Query(value="delete from product where id=?",nativeQuery=true)
	public List<product> deleteById(int id);

	@Query(value="select * from product where id=?",nativeQuery=true)
	public List<product> getbyid(int ids) ;



	
}
