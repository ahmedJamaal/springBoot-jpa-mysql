package com.springDemo.firstapp.io.enitiy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "users")
public class UserEnitiy implements Serializable{

	
	private static final long serialVersionUID = -4317874486191385328L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false , length = 50)
	private String firstName;
	
	@Column(nullable = false , length = 50)
	private String lastName;
	
	@Column(nullable = false , length = 120 ,unique = true)
	private String email;
	
	@Column(nullable = false)
	private String encrptPassword;
	
	private String emailVerficationToken;
	
	@Column(nullable = false)
	private Boolean emailVerficationStatus = false;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEncrptPassword() {
		return encrptPassword;
	}
	public void setEncrptPassword(String encrptPassword) {
		this.encrptPassword = encrptPassword;
	}
	public String getEmailVerficationToken() {
		return emailVerficationToken;
	}
	public void setEmailVerficationToken(String emailVerficationToken) {
		this.emailVerficationToken = emailVerficationToken;
	}
	public Boolean getEmailVerficationStatus() {
		return emailVerficationStatus;
	}
	public void setEmailVerficationStatus(Boolean emailVerficationStatus) {
		this.emailVerficationStatus = emailVerficationStatus;
	}
	

}
