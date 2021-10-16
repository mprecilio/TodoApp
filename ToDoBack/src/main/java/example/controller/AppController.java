package example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.models.UserModel;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@GetMapping(value="/test")
	public String myTest1() {
		System.out.println("In api GET");
		return "Get success";
	}
	
	
	@PostMapping(value="/new_account")
	public UserModel registration(@RequestBody UserModel user) {
		System.out.println(user);
		
		return null;
	}

}