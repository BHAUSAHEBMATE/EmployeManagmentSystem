package com.examples.demo.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repo extends CrudRepository<employe,Integer> {
	

}
