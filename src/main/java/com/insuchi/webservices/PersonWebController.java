package com.insuchi.webservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonWebController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		return "index";
	}
}