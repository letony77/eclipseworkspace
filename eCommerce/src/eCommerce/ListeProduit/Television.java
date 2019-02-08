package eCommerce.ListeProduit;

import eCommerce.Produit;

public class Television extends Produit{

	int Size;
	String SlabType;
	public Television(String nom, String description, double prix, int Size, String SlabType) {
		super(nom, description, prix);
		// TODO Auto-generated constructor stub
		this.Size = Size;
		this.SlabType = SlabType;	
	}
	public int getSize() {
		return Size;
	}
	public String getSlabType() {
		return SlabType;
	}
	
	

}
