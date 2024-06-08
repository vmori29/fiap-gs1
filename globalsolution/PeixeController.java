package com.github.vmori29.globalsolution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("peixe")
public class PeixeController {
	
	@GetMapping("form")
	public String form() {
		return "peixe/form";
	}
}