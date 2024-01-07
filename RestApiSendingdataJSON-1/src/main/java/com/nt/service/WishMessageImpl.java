package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service
public class WishMessageImpl implements IWishService {

	
	@Override
	public String GenerateWishMessage() {
		// TODO Auto-generated method stub
		LocalDateTime ldt=LocalDateTime.now();
		String msg=null;
		int hour=ldt.getHour();
		if(hour<12)
			msg="good Morning";
		else if(hour<16)
			msg="good afternoon";
		else if(hour<20)
			msg= "good evening";
		else
			msg= "Good Night";
		return msg;
		
	}

}
