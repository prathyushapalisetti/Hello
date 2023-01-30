package SpringHelloWorld.demoWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/HelloWorld")
	public String HelloWorld() {
		return "Hello World";
	}	
}


