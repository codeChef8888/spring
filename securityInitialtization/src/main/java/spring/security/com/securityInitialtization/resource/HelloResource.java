package spring.security.com.securityInitialtization.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/")
	public String home(){
		return ("<h1>Welcome</h1>");
	}
}
