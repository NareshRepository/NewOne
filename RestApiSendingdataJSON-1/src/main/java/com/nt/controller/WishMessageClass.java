package com.nt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishService;

@Controller
public class WishMessageClass {
	@Autowired
	private IWishService service;
	
	@RequestMapping("/home")
	public String Showhoepage() {
		return "welcome";
	}
	@RequestMapping("/wish")
	public ModelAndView showmsg() {
		ModelAndView mvn=new ModelAndView();
		String msg=service.GenerateWishMessage();
		mvn.addObject("wmsg",msg);
		mvn.addObject("sysdate",new Date());
		mvn.setViewName("show_result");
		return mvn;
	}
}
