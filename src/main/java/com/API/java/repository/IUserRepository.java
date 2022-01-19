package com.API.java.repository;

import org.springframework.data.repository.NoRepositoryBean;
/*import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;



import com.API.java.Entities.Bailleur;
import com.API.java.Entities.Contrat;
import com.API.java.Entities.Local;
import com.API.java.Entities.Locataire;
import com.API.java.Entities.Propriete;
import com.API.java.Entities.User;

*/

@NoRepositoryBean

public interface IUserRepository  {
	
	/*

	extends CrudRepository<User, Long>
	Optional<User> findByUsername(String username);
	Optional<User> findById(Integer id);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	public Locataire addLocataire(Locataire l);
	public Bailleur addBailleur(Bailleur b,Long codeBail);
	public Propriete addPropriete(Propriete p);
	public void addBailleurToPropriete(Long codeBail,Long CodePr);
	public Contrat addContrat(Contrat ct,Long CodeLoc,Long CodeBail);
	public Local  addLocal (Local lc, String codeClc,Long CodeBail);
	public Contrat consulerContrat(String CodeCt);
	public List<Local> consulterLocals(String codeCt); 
	public Locataire consulterLocataire(Long codeLoc); 
	public List<Locataire> consulterLocataires(String mc); 
	public List<Locataire> getContratsByLocataire(Long codeLoc);
	public List<Contrat> getContratsByBail(Long codeBail);
	public List<Bailleur> getBailleurs();
	public List<Propriete> getProprietes();
	public List<Bailleur> getBailleursByPropriete(Long codePr);
	*/
}

