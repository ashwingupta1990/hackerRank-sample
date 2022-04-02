package com.hackerrank.sample.controller;

import com.hackerrank.sample.dto.StringResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	 @ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/defaultHello", method = RequestMethod.GET )
	public StringResponse defaultHelloWorld() {
	return new StringResponse("Default Hello World!");
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/customHello", method = RequestMethod.POST )
	public StringResponse customHello(@RequestParam String message) {
	return new StringResponse("Custom " + message);
	
	
	}
	
	
}
