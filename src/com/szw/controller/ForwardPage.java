package com.szw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/ForwardPage")
public class ForwardPage {
	@RequestMapping(value = "/forwardPages")
	public String forwardPages(String name) {
		return name;
	}

}
