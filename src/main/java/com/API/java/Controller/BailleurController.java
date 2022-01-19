package com.API.java.Controller;




import org.springframework.web.bind.annotation.RestController;

import com.API.java.Entities.Bailleur;
import com.API.java.repository.BailleurRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value = "/api/tp/bailleur")

public class BailleurController {
	@Autowired
	private BailleurRepository bailleurRepository;
	@GetMapping(value = "/all")
	public List<Bailleur>getAllUsers(){
	    List<Bailleur> saliste= new ArrayList<>();
	    bailleurRepository.findAll().forEach(saliste::add);
		return saliste;
	} 
}
