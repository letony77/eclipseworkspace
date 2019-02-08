package WebShop;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Livraison.LivraisonStandard;
import Livraison.iLivraison;
import sun.nio.cs.ext.MacThai;



public class Facture {

	private Client client;
	private Map<Produit, Integer> produits = new HashMap<Produit,Integer>();
	private int quantite = 0;
	private double Total = 0;
	private iLivraison livraison;
	
	
	
//	private iLivraison iLivraison;
	
	
	public Client getClient() {
		return client;
	}
	
	public Map<Produit, Integer> getProduits() {
		return produits;
	}
	
	public void addProduit(Produit produit ,Integer quantite){
	this.produits.put(produit, quantite);
	}
	
	public Facture(Client client, iLivraison livraison) {
	this.client = client;
	this.livraison= livraison;
	}
	
	public void AfficheFacture(Map<Produit, Integer> produits) {
	
		System.out.println("----------------------------------");
		System.out.println("-------DETAIL DE LA COMMANDE------");
		System.out.println("----------------------------------");
		
		for(Entry<Produit, Integer> element : this.produits.entrySet()) {
		System.out.println("- " + element.getKey().getNom() + element.getKey().getDescription() + element.getKey().getPrix()+ "€ Qté " + element.getValue());
		
	
		}
		
		
	}
		
	
	public double totalProduits(Map<Produit, Integer> produits) {
		
		for (Entry<Produit, Integer> element : this.produits.entrySet()) {
			
			Total += (element.getKey().getPrix() * element.getValue())  ;
			Total = (double)Math.round(Total*100)/100;
			
		} 
			Total = Total + livraison.getprixLivraison();
			
			return Total;
		}
	
	}

