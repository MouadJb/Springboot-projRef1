package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employer;
import repertoire.EmployerRepertoire;

@RestController
@RequestMapping("/api/v1")
public class EmployerController {
	
	@Autowired
	private EmployerRepertoire employerRepertoire;
	
	//obtenir tous les employer
	@GetMapping("/employers")
	public List<Employer> getAllEmployer(){
		return employerRepertoire.findAll();
		
	}
}
