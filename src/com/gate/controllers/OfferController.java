package com.gate.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OfferController {
	@RequestMapping("/")
	
	public ModelAndView displayHome(){
		ModelAndView mav = new ModelAndView("home");
		Map<String,Object> model= mav.getModel();
		model.put("name", "sean");
		//session.setAttribute("name", "neeraj");
		return mav;
		//return "home";
	}
	
}
