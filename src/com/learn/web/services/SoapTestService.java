package com.learn.web.services;

public class SoapTestService {
	
	public String someLogic(int number){
		if(number > 100){
			return "Number is greater than 100";
		}else{
			return "This is not right";
		}
	}

}
