package com.API.java.Entities;
/*
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
*/
public class Propriete {
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id_prop;
	 @Column(name = "nom", nullable = false, updatable = true)
	private String nom;
	 @Column(name = "ville", nullable = false, updatable = true)
	private String ville;
	 @Column(name = "quartier", nullable = false, updatable = true)
	private String quartier;
	 @Column(name = "secteur", nullable = false, updatable = false)
	private String secteur;
	 @Column(name = "nombre_locaux", nullable = false, updatable = true)
	 private int  nombre_locaux; 
	 
	 // l'association est deja decrit dans l'autre clase groupe donc on utilise l'objet de mapping
	 @ManyToMany(mappedBy = "propriete")
	 private Collection<Bailleur> bailleurs;

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public int getNombre_locaux() {
		return nombre_locaux;
	}

	public void setNombre_locaux(int nombre_locaux) {
		this.nombre_locaux = nombre_locaux;
	}

	public Collection<Bailleur> getBailleurs() {
		return bailleurs;
	}

	public void setBailleurs(Collection<Bailleur> bailleurs) {
		this.bailleurs = bailleurs;
	}

	

	public Long getId_prop() {
		return id_prop;
	}

	public void setId_prop(Long id_prop) {
		this.id_prop = id_prop;
	}

	public Propriete() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Propriete(Long id_prop, String nom, String ville, String quartier, String secteur, int nombre_locaux,
			Collection<Bailleur> bailleurs) {
		super();
		this.id_prop = id_prop;
		this.nom = nom;
		this.ville = ville;
		this.quartier = quartier;
		this.secteur = secteur;
		this.nombre_locaux = nombre_locaux;
		this.bailleurs = bailleurs;
	}
	
	 
	 */

}
