package example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.models.UserModel;
import example.services.AppService;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	private AppService serv;
	
	
	
	@GetMapping(value="/test")
	public String myTest1() {
		System.out.println("In api GET");
		return "Get success";
	}
	
	
	@PostMapping(value="/new_account")
	public UserModel registration(@RequestBody UserModel user) {
		return serv.serviceRegistration(user);
	}
	
	@GetMapping(value="/all")
	public List<UserModel> allUsers() {
		return serv.serviceAll();
	}
	
	
}
