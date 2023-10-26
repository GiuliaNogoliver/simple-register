package br.com.component.user.management.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Company implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long idCompany;
	
	private String nameCompany;
	private DepartmentEnum department;
	
	public long getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(long idCompany) {
		this.idCompany = idCompany;
	}
	public String getNameCompany() {
		return nameCompany;
	}
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	public DepartmentEnum getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}
}