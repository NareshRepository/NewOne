package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("cust")
@ConfigurationProperties(prefix="cust.info")
@Setter
public class CustInfo {
	private String name;
	private int age;
	private String addrs;
	private float billAmt;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	
	@Override
	public String toString() {
		return "CustInfo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", billAmt=" + billAmt + "]";
	}
	
	

}
