package com.example.demo.web;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;

@RestController
@RequestMapping("/Categories")
public class ControleurCategorie {
	@Autowired
	private CategorieRepository categorieRepository;
	@GetMapping("/")
	public List<Categorie> Index(){
		return categorieRepository.findAll();
	}
}
