package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestMs")
public class ShowHomePage {
	@GetMapping("/show")
	public ResponseEntity<String> display(){
		 return new ResponseEntity<String>("Welcome to SpringBoot Application",HttpStatus.OK);
	}

}
