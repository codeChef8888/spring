package io.java.spring.security.jwt.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Sir/Madam.";
	}
}
