package com.API.java.Entities;









import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;







@Entity
@Table(	name = "user", schema="public")
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;


	private String username;

	private String email;

	private String password;
	

	private String proffession;

	private String num_tel;

	private int num_cni;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getProffession() {
		return proffession;
	}

	public void setProffession(String proffession) {
		this.proffession = proffession;
	}

	public String getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}

	public int getNum_cni() {
		return num_cni;
	}

	public void setNum_cni(int num_cni) {
		this.num_cni = num_cni;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", proffession=" + proffession + ", num_tel=" + num_tel + ", num_cni=" + num_cni + "]";
	}

	public User(Long id, String username, String email, String password, String proffession, String num_tel,
			int num_cni) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.proffession = proffession;
		this.num_tel = num_tel;
		this.num_cni = num_cni;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	




}
