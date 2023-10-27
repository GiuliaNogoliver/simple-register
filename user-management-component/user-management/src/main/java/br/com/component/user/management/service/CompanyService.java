package br.com.component.user.management.service;

import org.springframework.stereotype.Service;

import br.com.component.user.management.model.Company;

@Service
public interface CompanyService {

	Company subscribeCampany(Company company);
	
}
