package com.ust.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Registration {
	
	@PostMapping
	public String signup(
			@RequestParam("userName") String userName,
			@RequestParam("mail") String mail, 
			Model model) {
		

				if(userName.length() > 6 && mail.length() > 6) {
					model.addAttribute("userName", userName);
					model.addAttribute("email", mail);
					return "success";
				}
				
				else {
					return "error";
				}
		
	}
	
//	@GetMapping
//	public String respond(Model model) {
//		
//		model.addAttribute("myTech", "Java Full-Stack Developer");
//		model.addAttribute("myLocation", "Trivandrum");
//		return "resources2"; //view
//	}

}
