package br.com.component.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.component.user.management.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
