package br.com.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.component.user.management.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
}
