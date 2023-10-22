package br.com.component.user.management.model;

import java.time.LocalDate;

public class Person {
	
	private int IdPerson;
	private String namePerson;
	private String surname;
	private LocalDate birthDate;
	private String email;
	
	public int getIdPerson() {
		return IdPerson;
	}
	public void setIdPerson(int idPerson) {
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
