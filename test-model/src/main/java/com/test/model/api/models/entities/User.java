package com.test.model.api.models.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
	private BigInteger id;

	@Column(nullable=false, length=100)
	private String name;

	@Column(nullable=false, length=100)
	private String email;

	@Column(name="phone_number", nullable=false, length=15)
	private String phoneNumber;

	@Column(nullable=false, length=1)
	private String sex;
	
	public User(){
		
	}
	
	public User(BigInteger id, String name, String email, String phoneNumber, String sex){
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.sex = sex;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
        String regexEmailPattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern emailPattern = java.util.regex.Pattern.compile(regexEmailPattern);
        Matcher emailMatcher = emailPattern.matcher(email);
		
        if(!emailMatcher.matches()) {
			throw new IllegalArgumentException("Email field is not valid!");
		}
        
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return String.format("User[id=%d, name='%s', email='%s, phoneNumber='%s, sex='%s']", id, name, email, phoneNumber, sex);
	}

}
