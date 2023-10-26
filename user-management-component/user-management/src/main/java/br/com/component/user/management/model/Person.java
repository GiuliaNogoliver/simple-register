package br.com.component.user.management.model;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Person implements Serializable{

	private static final long serialVersionUID = 7737053682197321816L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long IdPerson;
	
	private String namePerson;
	private String surname;
	private LocalDate birthDate;
	private String email;
	
	public long getIdPerson() {
		return IdPerson;
	}
	public void setIdPerson(long idPerson) {
		IdPerson = idPerson;
	}
	public String getnamePerson() {
		return namePerson;
	}
	public void setnamePerson(String name) {
		this.namePerson = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
