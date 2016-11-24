package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Fullname;
import com.example.enity.Demo;
import com.example.service.DemoService;



@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(method = RequestMethod.GET) 
	public void hello(){
//		System.out.println("start.....");
//		List<Demo> list = demoService.getByEmail("foan.wang@111.111");
//		
//		for(int i = 0;i<list.size();i++ )
//		{
//			System.out.println("list"+list.get(i)+" id:"+list.get(i).getId()+" name:"+list.get(i).getName()+" email:"+list.get(i).getEmail()+" fullname:"+list.get(i).getFullname());
//		}
//		System.out.println("step.....2");
//		list = demoService.getByFullnameWithin()("2");
//		for(int i = 0;i<list.size();i++ )
//		{
//			System.out.println("name:"+list.get(i).getName()+" email:"+list.get(i).getEmail());
//		}
		Fullname fname = new Fullname("1", "2", "3");
		Demo demo = new Demo("uid1231","username222", "name111","foanwang@111.111", fname);
		demoService.Save(demo);
	}

//	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void register(@PathVariable("accountId") String accountId, @RequestBody test){ 
//	
//	
//	
}
