package WebShop;
import java.util.*;


public class Produit {
String nom;
String description;
Double prix;

public String getNom() {
	return nom;
}
public String getDescription() {
	return description;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}

public Produit(String nom, String description, Double prix) {
this.nom = nom;
this.description = description;
this.prix = prix;
}

public void look() {
}
public void buy(Facture facture, Integer quantite) {
	
}

}
