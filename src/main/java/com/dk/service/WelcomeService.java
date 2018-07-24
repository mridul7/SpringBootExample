package com.dk.service;


import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String retrieveWelcomeMessage()
	{
		return "Project answer";
	}
}
