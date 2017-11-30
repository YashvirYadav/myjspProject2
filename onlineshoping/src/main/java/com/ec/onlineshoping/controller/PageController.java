package com.ec.onlineshoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home","/index"})
	public ModelAndView index() {
		ModelAndView andView = new ModelAndView("page");
		andView.addObject("message", "Hello Spring");
		return andView;
		
	}
	
	@RequestMapping(value ="/test")
	public ModelAndView test(@RequestParam(value="greeting" ,required=false)String greeting) {
		
		if (greeting==null) {
			greeting ="Welcome";
		}
		
		ModelAndView andView = new ModelAndView("page");
		andView.addObject("message",greeting);
		return andView;	
	}
	
	
	@RequestMapping(value ="/test/{greeting}")
	public ModelAndView testPath(@PathVariable("greeting")String greeting) {
		
		if (greeting==null) {
			greeting ="Welcome";
		}
		
		ModelAndView andView = new ModelAndView("page");
		andView.addObject("message",greeting);
		return andView;	
	}

}
