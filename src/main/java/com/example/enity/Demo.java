package com.example.enity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.dto.Fullname;

@Document(collection = "demo")
public class Demo {
	private static final long serialVersionUID = -6843393213304991378L;
	
	@Id
	private String uid;
	
	private String username;

	private String email;

	private String name;
	
	private Fullname fullname ;
	
	@PersistenceConstructor
	public Demo( String uid,String username, String email, String name, Fullname fullname)
	{
		this.uid=uid;
		this.username =username;
		this.email=email;
		this.name = name;
		this.fullname =fullname; 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Fullname getFullname() {
		return fullname;
	}

	public void setFullname(Fullname fullname) {
		this.fullname = fullname;
	}


	public String getid() {
		return uid;
	}

	public void setid(String uid) {
		this.uid = uid;
	}

	

}
