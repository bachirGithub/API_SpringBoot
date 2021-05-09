package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Produit {
@Id
@GeneratedValue
private Integer IdProduit;
private String NomProduit;
private String Description;
private double PrixProduit;
/*@ManyToOne
private Categorie categorie;*/

public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String nomProduit, String description, double prixProduit
		//, Categorie categorie
		) {
	super();
	NomProduit = nomProduit;
	Description = description;
	PrixProduit = prixProduit;
	//this.categorie = categorie;
}
public Integer getIdProduit() {
	return IdProduit;
}
public void setIdProduit(Integer idProduit) {
	IdProduit = idProduit;
}
public String getNomProduit() {
	return NomProduit;
}
public void setNomProduit(String nomProduit) {
	NomProduit = nomProduit;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public double getPrixProduit() {
	return PrixProduit;
}
public void setPrixProduit(double prixProduit) {
	PrixProduit = prixProduit;
}
/*public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}*/

}
