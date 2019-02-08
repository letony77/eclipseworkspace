package Livraison;

public class LivraisonRelay implements iLivraison {

	public double prixLivraison;
	public String Info;
	
	public LivraisonRelay(){
		
	}
	@Override
	public double getprixLivraison() {
		// TODO Auto-generated method stub
		return 0.00;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "LIVRAISON POINT RELAIS";
	}

}
