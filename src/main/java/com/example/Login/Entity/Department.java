package com.example.Login.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -2383389719565385980L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
Integer depId;
String depName;
public Integer getDepId() {
	return depId;
}
public void setDepId(Integer depId) {
	this.depId = depId;
}
public String getDepName() {
	return depName;
}
public void setDepName(String depName) {
	this.depName = depName;
}
}
