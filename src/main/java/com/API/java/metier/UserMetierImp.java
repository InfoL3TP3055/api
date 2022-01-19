package com.API.java.metier;
/*
import java.util.List;

import javax.transaction.Transactional;

import com.API.java.Entities.Bailleur;
import com.API.java.Entities.Contrat;
import com.API.java.Entities.Local;
import com.API.java.Entities.Locataire;
import com.API.java.Entities.Propriete;
import com.API.java.repository.IUserRepository;
*/
/**
 * @Transactional : En demande a spring de gerer les transaction 
 * si la methode genere une exception spring vas faire une rollback sinon il faire un commit 
 * */
public class UserMetierImp  {
/*
@Transactional

	private IUserRepository iUserRepository;

	public void setDao(IUserRepository iUserRepository) {
		this.iUserRepository = iUserRepository;
	}

	@Override
	public Locataire addLocataire(Locataire l) {
		// TODO Auto-generated method stub
		return iUserRepository.addLocataire(l);
	}

	@Override
	public Bailleur addBailleur(Bailleur b, Long bailleurSup) {
		// TODO Auto-generated method stub
		return iUserRepository.addBailleur(b, bailleurSup);
	}

	@Override
	public Propriete addPropriete(Propriete p) {
		// TODO Auto-generated method stub
		return iUserRepository.addPropriete(p);
	}

	@Override
	public void addBailleurToProriete(Long CodeBaill, Long CodePr) {
		// TODO Auto-generated method stub
		iUserRepository.addBailleurToPropriete(CodeBaill, CodePr);
	}

	@Override
	public Contrat addContrat(Contrat ct, Long CodeLoc, Long CodeBail) {
		// TODO Auto-generated method stub
		return iUserRepository.addContrat(null, CodeLoc, CodeBail);
	}

	@Override
	public Contrat consulerContrat(String CodeCt) {
		// TODO Auto-generated method stub
		return iUserRepository.consulerContrat(CodeCt);
	}

	@Override
	public List<Local> consulterLocals(String codeCt) {
		// TODO Auto-generated method stub
		return iUserRepository.consulterLocals(codeCt);
	}

	@Override
	public Locataire consulterLocataire(Long codeLoc) {
		// TODO Auto-generated method stub
		return iUserRepository.consulterLocataire(codeLoc);
	}

	@Override
	public List<Locataire> consulterLocataires(String mc) {
		// TODO Auto-generated method stub
		return iUserRepository.consulterLocataires(mc);
	}



	@Override
	public List<Contrat> getContratsByBailleur(Long codebAIL) {
		// TODO Auto-generated method stub
		return iUserRepository.getContratsByBail(codebAIL);
	}

	@Override
	public List<Bailleur> getBailleurs() {
		// TODO Auto-generated method stub
		return iUserRepository.getBailleurs();
	}

	@Override
	public List<Propriete> getProprietes() {
		// TODO Auto-generated method stub
		return iUserRepository.getProprietes();
	}

	@Override
	public List<Bailleur> getBailleursByPropriete(Long codePr) {
		// TODO Auto-generated method stub
		return iUserRepository.getBailleursByPropriete(codePr);
	}

	

	@Override
	public List<Contrat> getContratsByLocataire(Long codeLoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contrat> geContratsByLocataire(Long codeLoc) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
