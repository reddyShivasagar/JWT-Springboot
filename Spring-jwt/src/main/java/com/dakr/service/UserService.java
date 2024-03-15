package com.dakr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dakr.model.User;

@Service
public class UserService {

	
	private List<User> store=new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Shivasagar","sagar12@gnail.com"));
		store.add(new User(UUID.randomUUID().toString(),"sham","sham12@gnail.com"));
		store.add(new User(UUID.randomUUID().toString(),"dinga","dinga12@gnail.com"));
		store.add(new User(UUID.randomUUID().toString(),"dingi","dingi12@gnail.com"));
	}
	
	public List<User> getUser(){
		return this.store;
	}
	
	
}
