package com.API.java.metier;

import java.util.List;

import com.API.java.Entities.Bailleur;
import com.API.java.Entities.Contrat;
import com.API.java.Entities.Local;
import com.API.java.Entities.Locataire;
import com.API.java.Entities.Propriete;

public interface IUserMetier {
	public Locataire addLocataire(Locataire l);
	public Bailleur addBailleur(Bailleur b, Long bailleurSup);
	public Propriete addPropriete(Propriete p);
	public void addBailleurToProriete(Long CodeBaill,Long CodePr);
	public Contrat addContrat(Contrat ct,Long CodeLoc,Long CodeBail);
	public Contrat consulerContrat(String CodeCt);
	public List<Local> consulterLocals(String codeCt); 
	public Locataire consulterLocataire(Long codeLoc); 
	public List<Locataire> consulterLocataires(String mc); 
	public List<Contrat> geContratsByLocataire(Long codeLoc);
	public List<Contrat> getContratsByBailleur(Long codebAIL);
	public List<Bailleur> getBailleurs();
	public List<Propriete> getProprietes();
	public List<Bailleur> getBailleursByPropriete(Long codePr);
	List<Contrat> getContratsByLocataire(Long codeLoc);

}
