package br.com.component.user.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.component.user.management.model.Company;

@Controller
public class CompanyController {
		
	@RequestMapping("/subcribeCompany")
	public ResponseEntity<String> subscribecompany(@RequestBody Company Company) {
		return ResponseEntity.ok("Company registered successfully!");
	}
}
