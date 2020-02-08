package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloControler {
	
	@ResponseBody
	public String hello() {
	  return "Hello World!";	
	}


}
