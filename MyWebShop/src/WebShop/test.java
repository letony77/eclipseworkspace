package WebShop;

import WebShop.Client;

import WebShop.Facture;
import WebShop.Produit;

import java.util.Map;

import ListeProduit.Frigo;
import ListeProduit.Televiseur;
import Livraison.LivraisonRelay;
import Livraison.LivraisonStandard;
import Livraison.iLivraison;
import java.util.*;
public class test {
public static void main(String[]args) {
	
	Client premierClient = new Client("Tony Hamza ", "SIMPLON 10 rue de Hamza");
	
	Produit Broyeur = new Produit("SAMSUNG COUPETOUT ", "EASY CUT ", 10.00);
	Televiseur LG = new Televiseur("LG 4K ", "TOP QUALITE ", 10.00, 55, "4K OLED");
	Frigo frigo = new Frigo("Phillips 5K ", "BEST QUALITY ", 20.00, 100, true);
	
//	LivraisonStandard livraisonstandard = new LivraisonStandard();
	
	System.out.println("Choisissez votre mode de livraison");
	System.out.println("LIVRAISON STANDARD : 1");
	System.out.println("Livraison RELAY : 2");
	Scanner sc = new Scanner(System.in);
	
	int choix;
	choix = sc.nextInt();
	iLivraison livraison = null;
	
	switch(choix){
		
	case 1:
	
	 livraison = new LivraisonRelay();
	 break;
	
	case 2:
		
	livraison = new LivraisonStandard();
	break;
	}
	
	
	
	Facture facture = new Facture(premierClient, livraison);
	facture.addProduit(Broyeur, 1);
	facture.addProduit(LG, 1);
	facture.addProduit(frigo, 1);
	
	
	Map<Produit,Integer> ListeProduit = facture.getProduits();
	System.out.println("-------------CHEZ HAMZA-----------");
	System.out.println("------------15 RUE HAMZA----------");
	System.out.println("-----------06.12.34.56.78---------");
	facture.AfficheFacture(ListeProduit);
	System.out.println("- FRAIS DE LIVRAISON " +"(" + livraison.getInfo()+ ")"+ livraison.getprixLivraison() + "€");
	System.out.println("----------------------------------");
	System.out.println("--------METHODE DE LIVRAISON------");
	System.out.println("VOTRE CHOIX DE LIVRAISON :");
	System.out.println((livraison.getInfo()));;
	System.out.println("--------ADRESSE DE LIVRAISON------ ");
	System.out.println(premierClient.getFullName() + premierClient.getAdresse());
//	livraisonstandard.AfficherLivraisonStandard(3.0,"Vous avez choisi la livraison standard 3 Jours \n" + premierClient.getFullName()+"\n" + premierClient.getAdresse());
	System.out.println();
	System.out.println("----------------------------------");
	System.out.println("----------------------------------");
	System.out.println("-----------PRIX TOTAL-------------");
	System.out.println("----------------------------------");
	System.out.println("--------- TOTAL = " + facture.totalProduits(ListeProduit) +"€ -------");
	System.out.println("----------------------------------");
	
}
}