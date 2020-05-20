package org.java.courses.ressources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

	@GetMapping("/")
	public String home() {
		return "<h1>Welcom to my web application</h1>";
	}

	@GetMapping("/user")
	public String user() {
		return "<h1>Welcom to my web application  User</h1>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcom to my web application  admin</h1>";
	}

}
