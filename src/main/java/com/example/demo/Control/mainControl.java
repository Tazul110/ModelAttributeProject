package com.example.demo.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Programmer;
@Controller
public class mainControl {
	
	@RequestMapping("/home")
	 public String homePage()
	 {
		return "HomePage.html";
	 }
	
	@RequestMapping("/User_info")
	 public ModelAndView User_information(@ModelAttribute Programmer programmer)	 
	 {
		ModelAndView mv=new ModelAndView(); 
		mv.setViewName("User_info.html");
		
		return mv;
	 }
}
