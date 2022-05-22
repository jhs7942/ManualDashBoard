package org.manual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class MainController {

	@GetMapping("/blank")
	public void menu() {
		
	}
	
	@GetMapping("/index")
	public void test() {
		
	}
	
	@GetMapping("/ui")
	public void test1() {
		
	}
}
