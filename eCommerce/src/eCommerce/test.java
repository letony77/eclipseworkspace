package eCommerce;

import java.util.Map;

import eCommerce.Produit;
import eCommerce.ListeProduit.Frigo;
import eCommerce.ListeProduit.Television;

public class test {
public static void main(String[]args) {
	
	Client premierClient = new Client("Tony Hamza", "SIMPLON 10 rue de Simplon");
	
	Produit Broyeur = new Produit("SAMSUNG COUPETOUT", "Il coupe tout meme les pierres", 799.99);
	Television LG = new Television("LG 4K", "TOP QUALITE", 2999.99, 55, "4K OLED");
	Frigo frigo = new Frigo("LG insane", "faible consommation foure tout", 539.99, 100, true);
	
	Facture facture = new Facture(premierClient);
	facture.addProduit(Broyeur, 1);
	facture.addProduit(LG, 1);
	facture.addProduit(frigo, 1);
	
	Map<Produit,Integer> ListeProduit = facture.getProduits();
	facture.AfficheFacture(ListeProduit);
	
}

}
