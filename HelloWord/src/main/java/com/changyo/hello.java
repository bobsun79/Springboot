package com.changyo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping("/123")
	public String index(){
		System.out.print("Hello Word!");
		return "hello Word";
		
	}

}
