package br.com.component.user.management.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.component.user.management.model.Company;

@RestController
public class CompanyController {
		
	@PostMapping("/subcribeCompany")
	public Company subscribecompany(@RequestBody Company Company) {
		return Company;
	}
}