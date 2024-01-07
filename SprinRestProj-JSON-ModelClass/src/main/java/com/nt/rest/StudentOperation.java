package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;

@RestController
@RequestMapping("/studentapi")
public class StudentOperation {
	
@PostMapping("/save")	
 public ResponseEntity<Student> registration(@RequestBody Student stud){
	 
	 return new ResponseEntity<Student>(stud,HttpStatus.CREATED);
 }
}
