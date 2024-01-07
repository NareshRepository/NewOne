package com.nt.controller;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.IWishService;

@Controller
public class WiShmessage {
	@Autowired
	private IWishService service;
	
	@RequestMapping("/home")
	public String Showhoepage() {
		
		return "welcome";
	}
	/*@RequestMapping("/wish")
	public ModelAndView showmsg() {
		ModelAndView mvn=new ModelAndView();
		String msg=service.wishmessagegenerate();
		mvn.addObject("wmsg",msg);
		mvn.addObject("sysdate",new Date());
		mvn.setViewName("show_result");
		return mvn;
	}*/
	
	@RequestMapping("/wish")
	public String showhomepage(HashMap<String,Object> map) {
		System.out.println("saved memory class is :; "+map.getClass());
		System.out.println("WiShmessage.showhomepage()");
		String msg=service.wishmessagegenerate();
		map.put("wmsg", msg);
		map.put("sysdate",new Date());
		return null;
	}


}
