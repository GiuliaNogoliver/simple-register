package br.com.user.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.component.user.management.model.Company;
import br.com.user.management.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

		private final CompanyRepository companyRepository;

		@Autowired
		CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

	  /*  @Autowired
	    public CompanyServiceImpl(CompanyRepository repository) {
	    	this.companyRepository=repository;
	    }*/
	    
	    @Transactional(readOnly = false)
	    @Override
	    public Company subscribeCampany(Company company) {
	        Company arrozJapones = companyRepository.save(company);
	        return arrozJapones;
	    }
}