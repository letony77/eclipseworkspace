package eCommerce;

import java.util.Map;
import java.util.Map.Entry;

import WebShop.Produit;


public class Facture {

private	Client client;
private	Map<Produit,Integer> produits;



public Client getClient() {
	return client;
}



public Map<Produit, Integer> getProduits() {
	return produits;
}



public void addProduit(Produit produit,Integer quantite) {
	this.produits.put(produit,quantite);
	
}

public Facture(Client client) {
	this.client = client;
	
}
public void AfficheFacture(Map<Produit, Integer> produit) {
	System.out.println("Detail de la commande");
	for(Entry<Produit, Integer> element : this.produits.entrySet()) {
	System.out.println("- " + element.getValue()+ " " + element.getKey().getDescription());
	}
}
}