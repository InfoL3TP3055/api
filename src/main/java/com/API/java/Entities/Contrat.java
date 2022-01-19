package com.API.java.Entities;
/*
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
*/
public class Contrat {
	/* @Id
	 @GeneratedValue(strategy =GenerationType.IDENTITY)
	 private Long codeContrat; 
			
			 @Column(name = "titre", nullable = true, updatable = true)
		   private String titre;
			@Column(name = "date_sor", unique=true, insertable=true, updatable=true, nullable=false)
		    private String date_sor;
			@Column(name = "date_ent", unique=true, insertable=true, updatable=true, nullable=false)
		    private String date_ent;
			 @Column(name = "description", nullable = true, updatable = true)
		   private String description;
			@Column(name = "montantmensuel", insertable=true, updatable=true, nullable=false)
		    private String montantmensuel;
	 // la sociation est deja decrit dans l'autre clase groupe donc on utilise l'objet de mapping
	 @ManyToMany(mappedBy = "contrat")
	 private Collection<Bailleur> bailleurs;
	 
	 @ManyToOne
	 private Collection<Locataire> locataires;
	

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(Long codeContrat, String titre, String date_sor, String date_ent, String description,
			String montantmensuel, Collection<Bailleur> bailleurs) {
		super();
		this.codeContrat = codeContrat;
		this.titre = titre;
		this.date_sor = date_sor;
		this.date_ent = date_ent;
		this.description = description;
		this.montantmensuel = montantmensuel;
		this.bailleurs = bailleurs;
	}

	public Long getCodeContrat() {
		return codeContrat;
	}

	public void setCodeContrat(Long codeContrat) {
		this.codeContrat = codeContrat;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDate_sor() {
		return date_sor;
	}

	public void setDate_sor(String date_sor) {
		this.date_sor = date_sor;
	}

	public String getDate_ent() {
		return date_ent;
	}

	public void setDate_ent(String date_ent) {
		this.date_ent = date_ent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMontantmensuel() {
		return montantmensuel;
	}

	public void setMontantmensuel(String montantmensuel) {
		this.montantmensuel = montantmensuel;
	}

	public Collection<Bailleur> getBailleurs() {
		return bailleurs;
	}

	public void setBailleurs(Collection<Bailleur> bailleurs) {
		this.bailleurs = bailleurs;
	}

	public void setLocataire(Locataire loc) {
		// TODO Auto-generated method stub
		
	}

	public void setBailleur(Bailleur bail) {
		// TODO Auto-generated method stub
		
	}*/

}
