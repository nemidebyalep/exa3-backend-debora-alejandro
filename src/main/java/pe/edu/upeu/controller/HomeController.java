package pe.edu.upeu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/home")
	public String mensaje() {
		return "Spring Oracle";
	}
}
