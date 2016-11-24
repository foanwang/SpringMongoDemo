package com.example.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.enity.Demo;



public interface DemoRepository extends MongoRepository<Demo, String>{
	
	Demo findById(Integer id);
	
	List<Demo> findByname(String name);

	List<Demo> queryByEmail(String eee);
	List<Demo> queryByfullnameContaining(String middlename);
	List<Demo> queryByfullnameWithin(String middlename);
}
