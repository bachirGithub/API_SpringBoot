package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;

@SpringBootApplication
public class ApiProjetApplication implements CommandLineRunner {
    @Autowired
	private ProduitRepository produitRepository;
    @Autowired
    private CategorieRepository categorieRepository;
	public static void main(String[] args) {
		SpringApplication.run(ApiProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie c1=new Categorie("Bureautique");
		Categorie c2=new Categorie("immobilier");
		categorieRepository.save(c1);categorieRepository.save(c2);
		Produit p1=new Produit("Orinateur","fixe de bureau",4800);
		Produit p2=new Produit("Imprimante","Lazer puissante",6000);
		Produit p3=new Produit("PC HP","portable pc",3000);
		Produit p4=new Produit("Salle","Salle de conference",1000);
		Produit p5=new Produit("Appartement","Bien équipé",25000);
		produitRepository.save(p1);produitRepository.save(p2);
		produitRepository.save(p3);produitRepository.save(p4);
		produitRepository.save(p5);
	}

}
