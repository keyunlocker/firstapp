package com.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@GetMapping(value="/first")
	public String name(@RequestParam(value="name",required=true)String name) {
		return name;
	}
}
