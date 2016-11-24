package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enity.Demo;
import com.example.repository.DemoRepository;



@Service
public class DemoService{
	
	@Autowired
	private DemoRepository repository;
	
	public void Save(Demo demo) {
		repository.save(demo);
	}
	
	public List<Demo> getByEmail(String email) {
		List<Demo> list = repository.queryByEmail(email);
		return list;
	}
	
	public List<Demo> getByName(String name) {
		List<Demo> list = repository.findByname(name);
		return list;
	}
	
	public List<Demo> getByFullnameContaining(String name) {
		List<Demo> list = repository.queryByfullnameContaining(name);
		return list;
	}
	public List<Demo> getByFullnameWithin(String name) {
		List<Demo> list = repository.queryByfullnameWithin(name);
		return list;
	}
}
