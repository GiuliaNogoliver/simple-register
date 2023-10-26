package br.com.user.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.component.user.management.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}
