package com.API.java.repository;





import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.API.java.Entities.Bailleur;



@Repository
public interface BailleurRepository  extends JpaRepository<Bailleur, Long>{

	Optional<Bailleur> findByUsername(String username);
	Optional<Bailleur> findById(Integer id);
	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email); 
}
