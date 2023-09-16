package com.jsp.hospital.branch;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
private int id;
private String branch_name;
private String branch_city;
private long c_no;

@OneToMany
private List<Hospital> hospitals;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBranch_name() {
	return branch_name;
}

public void setBranch_name(String branch_name) {
	this.branch_name = branch_name;
}

public String getBranch_city() {
	return branch_city;
}

public void setBranch_city(String branch_city) {
	this.branch_city = branch_city;
}

public long getC_no() {
	return c_no;
}

public void setC_no(long c_no) {
	this.c_no = c_no;
}

public List<Hospital> getHospitals() {
	return hospitals;
}

public void setHospitals(List<Hospital> hospitals) {
	this.hospitals = hospitals;
}

}
