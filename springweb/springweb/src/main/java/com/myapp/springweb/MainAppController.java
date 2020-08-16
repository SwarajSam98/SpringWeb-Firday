package com.myapp.springweb;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class MainAppController {
	@Autowired
	private UserService userService;
	//@RequestMapping(value= "/greetings", method= RequestMethod.GET)
	@GetMapping("greetings")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to my Spring Web";
	}
	//@RequestMapping(value= "/hello", method= RequestMethod.GET)
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello welcome to spring boot";
	}
	@GetMapping("/login")
	
	public String login() {
		return "login";
	}
	@PostMapping("/login")
	@ResponseBody
	public String loginvalid(@RequestParam("uname")String name,@RequestParam("pass")String pass   ) {
		boolean result= userService.loginValid(name, pass);
		if(result) {
			return " Login successful";
		}
		return "Login fail";
	}
@GetMapping("/register")
	
	public String register() {
		return "register";
	}
@PostMapping("/register")
@ResponseBody
public String registervalid(@RequestParam("name")String name,@RequestParam("email")String email, @RequestParam("dob")String dob, @RequestParam("city")String city   ) {
	User usr = new User(name, email,dob,city);
	ArrayList<User> list = new ArrayList<>();
	list.add(usr);
	userService.addUser(name, list);
	return "User is registered";

}

}
