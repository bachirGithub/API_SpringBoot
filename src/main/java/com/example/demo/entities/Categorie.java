package com.example.demo.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie {
@Id
@GeneratedValue
private Integer IdCategorie;
private String NomCategorie;
/*@OneToMany(mappedBy="categorie")
private Collection<Produit> produits;*/

public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}
public Categorie(String nomCategorie) {
	NomCategorie = nomCategorie;
}
public Integer getIdCategorie() {
	return IdCategorie;
}
public void setIdCategorie(Integer idCategorie) {
	IdCategorie = idCategorie;
}
public String getNomCategorie() {
	return NomCategorie;
}
public void setNomCategorie(String nomCategorie) {
	NomCategorie = nomCategorie;
}
/*public Collection<Produit> getProduits() {
	return produits;
}
public void setProduits(Collection<Produit> produits) {
	this.produits = produits;
}*/



}

