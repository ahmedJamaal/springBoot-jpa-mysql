package com.springDemo.firstapp.shared;

import java.io.Serializable;

public class UserDto  implements Serializable{

	private static final long serialVersionUID = -3516620577430042189L;
	private long id;
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String encrptPassword;
	private String emailVerficationToken;
	private Boolean emailVerficationStatus= false;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
