package br.com.component.user.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.component.user.management.model.Company;
import br.com.user.management.repository.CompanyRepository;


@RestController
public class CompanyController {

	private final CompanyRepository companyRepository;
	
	@Autowired
	public CompanyController(CompanyRepository companyRepository) {
		this.companyRepository=companyRepository;
	}
	
	@PostMapping("/subcribeCompany")
	public Company subscribecompany(@RequestBody Company company) {
		company=companyRepository.save(company);
		return company;
	}
}