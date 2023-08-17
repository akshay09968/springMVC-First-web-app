package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/p1", method=RequestMethod.GET)
	public String ViewPage1() {
		return "Page1";
	}
	
	@RequestMapping(value="/p2", method=RequestMethod.GET)
	public String ViewPage2() {
		return "Page2";
	}
}
