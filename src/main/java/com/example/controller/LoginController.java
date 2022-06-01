package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	 @RequestMapping("/index")
	    public String index(Model model) {
	      

	        return "index";
	    }
     @RequestMapping(value = "/login", method= RequestMethod.GET)
        public String toLogin(@ModelAttribute("login") LoginForm form, Model model) {
    	 
    	 return "login";
     }
	 @RequestMapping(value ="/login",method = RequestMethod.POST)
	 public String login(@ModelAttribute("login") LoginForm form, Model model) {
		 String id = form.getId();
		 String pass = form.getPass();
		 if(id.equals("axiz") && pass.equals("axizuser")) {
			 return "menu";
		 }else
		 model.addAttribute("error","IDまたはPASSが間違っています。");
		 return "login";
	 }
}
