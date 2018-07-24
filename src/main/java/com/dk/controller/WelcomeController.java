package com.dk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dk.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")
	@ResponseBody  // as no get and post so both req will come here.
	public String welcome()
	{
		return service.retrieveWelcomeMessage();
	}
}



