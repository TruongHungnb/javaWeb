package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.HomeService;

@Controller(value = "newControllerOfAdmin")
public class NewController {
  
//	@Autowired
//	private HomeService homeService;
	
   @RequestMapping(value = "/new/list", method = RequestMethod.GET)
   public ModelAndView showList() {
      ModelAndView mav = new ModelAndView("admin/new/list");
//      mav.addObject("menu", homeService.loadMenu());
      return mav;
   }
  
   @RequestMapping(value = "/new/edit", method = RequestMethod.GET)
   public ModelAndView editNew() {
      ModelAndView mav = new ModelAndView("admin/new/edit");
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