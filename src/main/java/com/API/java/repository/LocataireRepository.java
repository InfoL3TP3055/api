package com.API.java.repository;

import com.API.java.Entities.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocataireRepository extends JpaRepository<Locataire, Integer> {
    Optional<Locataire> findByUsername(String username);
    Optional<Locataire> findById(Integer id);
    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
