package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix="emp.details")
@Component("emp")
public class Employe {
	private int age;
	
	private String name;
	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
