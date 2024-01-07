package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.CustInfo;
import com.nt.beans.Employe;

@SpringBootApplication
public class BootpProj4Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootpProj4Application.class, args);
	CustInfo c=ctx.getBean("cust",CustInfo.class);
	System.out.println("details are  :: "+c);
	System.out.println("-------");
	Employe e=ctx.getBean("emp",Employe.class);
	System.out.println("employe details are :: "+e);
	}

}
