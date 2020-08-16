package com.myapp.springweb;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	HashMap<String, ArrayList<User>> hm = new HashMap<String, ArrayList<User>>();
	public boolean loginValid(String name, String pass) {
		if(name.equals("admin") && pass.equals("password")) {
			return true;
		}
		return false;
	}
	public void addUser(String name, ArrayList<User> usr) {
		hm.put(name, usr);
		System.out.println(hm);
	}

}
