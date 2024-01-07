package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")//globalPath
public class MessageRenderController {
	//@GetMapping("/wish")//MethodPath
	@PostMapping("/wish")
	public ResponseEntity<String> showmessage(){
		LocalDateTime ldt=LocalDateTime.now();
		String  msg=null;
		int hour=ldt.getHour();
		if(hour<12) 
			msg= "good Moring";
		else if(hour<16) 
			msg="good afternoon";
		else if(hour<20)
			msg="good evening";
		else
			msg="good night";
		ResponseEntity<String> entity=new ResponseEntity<String>(msg,HttpStatus.OK);
		return entity;

			
		
		
		
	}

}
