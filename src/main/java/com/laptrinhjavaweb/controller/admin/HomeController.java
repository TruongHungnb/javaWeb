package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.HomeService;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {
  
//	@Autowired
//	private HomeService homeService;
	
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("admin/home");
//      mav.addObject("menu", homeService.loadMenu());
      return mav;
   }
  
//   @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
//   public ModelAndView springMVCPage() {
//      ModelAndView mav = new ModelAndView("admin/springmvc");
//      mav.addObject("menu", homeService.loadMenu());
//      return mav;
//   }
}