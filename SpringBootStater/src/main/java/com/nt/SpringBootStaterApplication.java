package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBootStaterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootStaterApplication.class, args);
		
		EmployeeDAO dao=ctx.getBean("empDAO",EmployeeDAO.class);
		try {
		System.out.println("emps count :: "+dao.getEmpsCount());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			
		}
	

}
