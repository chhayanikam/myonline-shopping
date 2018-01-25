package com.niit.myonlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value={"/","home","/index"})
	public String index()
	{
		//ModelAndView mv=new ModelAndView();
		//mv.addObject("greeting","Welcome to Spring Web MVC");
		//return mv;
		return "Page";
	}

}
