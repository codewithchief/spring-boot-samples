package org.code.with.chief.conrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping("/greet")
	public String greet() {		
		
		int i = 10;
		int j = 0;
		return "Hello World !!!" + (i/j) ;
	}
}
