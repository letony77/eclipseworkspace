package ListeProduit;

import WebShop.Produit;

public class Televiseur extends Produit {
int Size;
String Taille;

	public int getSize() {
	return Size;
}

public String getTaille() {
	return Taille;
}

	public Televiseur(String nom, String description, Double prix, int Size, String Taille) {
		super(nom, description, prix);
		// TODO Auto-generated constructor stub
		this.Size = Size;
		this.Taille = Taille;
		
	}

}
