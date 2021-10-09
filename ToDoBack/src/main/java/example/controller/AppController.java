package example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@GetMapping(value="/test")
	public String myTest1() {
		System.out.println("In api GET");
		return "Get success";
	}
	
	@PostMapping(value="/test")
	public String myTest() {
		System.out.println("In api POST");
		return "Post success";
	}
	
	

}
