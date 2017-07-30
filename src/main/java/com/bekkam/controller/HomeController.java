/**
 * 
 */
package com.bekkam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BEKKAMB
 *
 */ 
@RestController
public class HomeController {

	@RequestMapping("/")
	public String getHome()
	{ 
		return "Welcome Bhupal";
	}
	
	@RequestMapping("/about")
	public String getPath()
	{ 
		return "This is About Us Page !!";
	}
 
	@RequestMapping("/contact")
	public String getContact()
	{ 
		return "This is Contatct Us Page !!";
	}
 
}
