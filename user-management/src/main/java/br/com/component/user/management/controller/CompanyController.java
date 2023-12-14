package br.com.component.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.component.user.management.model.Company;
import br.com.component.user.management.service.CompanyService;

@RestController
@RequestMapping(value ="/")
public class CompanyController {

	private final CompanyService service;
	
	@Autowired
	public CompanyController(CompanyService companyService) {
		this.service=companyService;
	}
	
	@PostMapping("/subscribeCompany")
	public Company subscribecompany(@RequestBody Company company) {
		Company rodizio = this.service.subscribeCampany(company);
		return rodizio;
	}
}