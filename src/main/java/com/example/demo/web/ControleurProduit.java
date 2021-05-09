package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Produit;
@RestController
public class ControleurProduit {
	@Autowired
	private ProduitRepository produitRepository;
	
    @GetMapping(value="/produits",produces="application/json")
	public List<Produit> Index(){
		return produitRepository.findAll();
	}
    @GetMapping("/produits/{id}")
  	public Produit Index1(@PathVariable int id){
  		return produitRepository.findById(id).get();
  	}
    @PostMapping("/produits")
	public Produit Ajouter(@RequestBody Produit p){
		return produitRepository.save(p);
	}
    @PutMapping("/produits/{id}")
	public Produit Modifier(@RequestBody Produit p,@PathVariable int id){
		p.setIdProduit(id);
    	return produitRepository.saveAndFlush(p);
	}
    @DeleteMapping("produits/{id}")
   	public void Supprimer(@PathVariable int id){
       	produitRepository.deleteById(id);
   	}
}
