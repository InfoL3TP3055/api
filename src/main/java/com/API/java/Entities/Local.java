package com.API.java.Entities;

/*
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	*/	/**
		 * dans ce cas j'ai pas sp�cifier la notation @DiscriminatorColumn 
		 * il vas utlis� un tye par defaut 
		 */
public class Local {
	
	/*private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @Column(name = "nom", nullable = false, updatable = true)
	private String nom;
	
	 @Column(name = "prix", nullable = false, updatable = true)
	private int prix;         
	 @Column(name = "nombre_pieces", nullable = false, updatable = true)
	private int nombre_pieces;
	 @ManyToOne
	   @JoinColumn(name = "code_contrat")
	   private Contrat contrat; 
	   @ManyToOne
	   @JoinColumn(name = "code_bail")
	   private Bailleur bailleur;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getNombre_pieces() {
		return nombre_pieces;
	}
	public void setNombre_pieces(int nombre_pieces) {
		this.nombre_pieces = nombre_pieces;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Bailleur getBailleur() {
		return bailleur;
	}
	public void setBailleur(Bailleur bailleur) {
		this.bailleur = bailleur;
	}
	public Local(Long id, String nom, int prix, int nombre_pieces, Contrat contrat, Bailleur bailleur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.nombre_pieces = nombre_pieces;
		this.contrat = contrat;
		this.bailleur = bailleur;
	}
	public Local(Long id, String nom, int prix, int nombre_pieces, Bailleur bailleur) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.nombre_pieces = nombre_pieces;
		this.bailleur = bailleur;
	}
	public Local() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	*/

}
