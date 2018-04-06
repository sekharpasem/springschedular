package com.spring.sekhar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/greeting")
	public Map<String, String> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		Map<String, String> response = new HashMap<String, String>();
		String greeting = "Hello " + name;
		response.put("name", greeting);
		return response;
	}
}
