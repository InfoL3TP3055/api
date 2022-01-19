package com.API.java.repository;
/*
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.API.java.Entities.Bailleur;
import com.API.java.Entities.Contrat;
import com.API.java.Entities.Local;
import com.API.java.Entities.Locataire;
import com.API.java.Entities.Propriete;
import com.API.java.Entities.User;*/

public class UserImp {
/*
	@PersistenceContext
	private EntityManager entityManger; 


	@Override
	public Bailleur addBailleur(Bailleur b, Long codeBail) {
		if (codeBail!=null) {
			Bailleur sup = entityManger.find(Bailleur.class, codeBail);
			
		}
		entityManger.persist(b);
		return b;
	}

	@Override
	public Propriete addPropriete(Propriete p) {
		entityManger.persist(p);
		return p;
	}



	@Override
	public Contrat addContrat(Contrat ct, Long CodeLoc, Long CodeBail) {
Locataire loc = entityManger.find(Locataire.class, CodeLoc);
		Bailleur bail = entityManger.find(Bailleur.class, CodeBail);
		ct.setLocataire(loc);
		ct.setBailleur(bail);
		entityManger.persist(ct);
		return ct;
	}

	/*@Override
	public Operation addOperation(Operation op, String codeCpe, Long CodeEmp) {
		Compte cp = consulerCompte(codeCpe);
		Bailleur emp = entityManger.find(Bailleur.class, codeCpe);
		op.setCompte(cp);
		op.setEmploye(emp);
		entityManger.persist(op);
		return op;
	}

	@Override
	public Contrat consulerContrat(String CodeCt) {
		Contrat ct = entityManger.find(Contrat.class, CodeCt);
		return ct;
	}
*/
	/*@Override
	public List<Operation> consulterOperations(String CodeCpt) {
		Query req= entityManger.createQuery("select o from Operation o where o.compte.codeCompte=:x");
		req.setParameter("x", CodeCpt);
		return req.getResultList();
	}
*/

/*
	@Override
	public List<Locataire> consulterLocataires(String mc) {
		Query req= entityManger.createQuery("select c from Locataire c where c.nomLocataire like:x");
		req.setParameter("x","%" +mc+"%");
		return req.getResultList();
	}

	
	@Override
	public List<Contrat> getContratsByBail(Long codeBail) {
		Query req= entityManger.createQuery("select c from Contrat c where c.bailleur.codeBailleur=:x");
		req.setParameter("x",codeBail);
		return req.getResultList();
	}

	@Override
	public List<Bailleur> getBailleurs() {
		Query req= entityManger.createQuery("select b from Bailleur b");
		return req.getResultList();
	}

	@Override
	public List<Propriete> getProprietes() {
		Query req= entityManger.createQuery("select g from Propriete g");
		return req.getResultList();
	}

	@Override
	public List<Bailleur> getBailleursByPropriete(Long codePr) {
		Query req= entityManger.createQuery("select b from Bailleur b where b.proprietes.codePropriete=:x");
		req.setParameter("x",codePr);
		return null;
	}

	@Override
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locataire addLocataire(Locataire l) {
		entityManger.persist(l);
		return l;
	}

	@Override
	public void addBailleurToPropriete(Long codeBail, Long CodePr) {
		Bailleur bail = entityManger.find(Bailleur.class, codeBail);
		Propriete prop=entityManger.find(Propriete.class, CodePr);
		prop.getBailleurs().add(bail);
	}

	@Override
	public Local addLocal(Local lc, String codeClc, Long CodeBail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Local> consulterLocals(String codeCt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locataire consulterLocataire(Long codeLoc) {
		Locataire cl = entityManger.find(Locataire.class, codeLoc);
		return cl;
	}

	@Override
	public List<Locataire> getContratsByLocataire(Long codeLoc) {
		Query req= entityManger.createQuery("select c from Contrat c where l.locataire.codeLocataire=:x");
		req.setParameter("x",codeLoc);
		return req.getResultList();
	}
*/
}
