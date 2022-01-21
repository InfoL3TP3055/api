package com.API.java.Entities;
//import java.util.Collection;


import javax.persistence.Entity;
//import javax.persistence.FetchType;

//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "locataire",schema = "public")

public class Locataire extends User {

	private static final long serialVersionUID = 1L;

	private Long id_loc; 
	
	public Long getId_loc() {
		return id_loc;
	}

	public void setId_loc(Long id_loc) {
		this.id_loc = id_loc;
	}

	
	
	 
	public Locataire(Long id, String username, String email, String password, String proffession, String num_tel,
			int num_cni, Long id_loc) {
		super(id, username, email, password, proffession, num_tel, num_cni);
		this.id_loc = id_loc;
		
	}

	public Locataire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Locataire(Long id, String username, String email, String password, String proffession, String num_tel,
			int num_cni) {
		super(id, username, email, password, proffession, num_tel, num_cni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + ", id_loc=" + id_loc ;
	}
	

}
