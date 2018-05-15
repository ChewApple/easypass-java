package com.joshua.easypass.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

	@Autowired
	private HttpServletRequest request;
		
	protected HttpServletRequest getRequest(){
		return request;
	}	
}
