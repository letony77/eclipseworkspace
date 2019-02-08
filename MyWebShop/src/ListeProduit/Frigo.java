package ListeProduit;

import WebShop.Produit;


public class Frigo extends Produit {

	int litre;
	boolean congelateur;
	public Frigo(String nom, String description, double prix, int litre , boolean freezer) {
		super(nom, description, prix);
		this.litre = litre;
		this.congelateur = freezer;
	}
	public int getLitre() {
		return litre;
	}
	public boolean iscongelateur() {
		return congelateur;
	}

}
