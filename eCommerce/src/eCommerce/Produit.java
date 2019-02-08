package eCommerce;
import java.util.*;
public class Produit {
	String nom;
	String description;
	double prix;
	
	
	// Getter and Setter 
	
	public String getNom() {
		return nom;
	}



	public String getDescription() {
		return description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	// Debut de la classe
	
	public Produit (String nom, String description, double prix) {
		
	}
	public void look() {
	}
	public void buy(Facture facture,Integer quantite) {
	}
}
