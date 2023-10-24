package br.com.component.user.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.component.user.management.model.Person;

@Controller
public class PersonController {
	
	@RequestMapping("/subcribePerson")
	public ResponseEntity<String> subscribeperson(@RequestBody Person Person) {
		return ResponseEntity.ok("User registered successfully!");
	}
}
