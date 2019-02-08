package Livraison;

public class LivraisonStandard implements iLivraison{

	public double prixLivraison;
	public String Info;
	public LivraisonStandard() {
//		this.Info = Info;
//		this.prixLivraison = prixLivraison;
//		// TODO Auto-generated constructor stub
//		prixLivraison = 3.0;
//		Info = "Vous avez choisi la livraison standard 3 Jours \n" + premierClient.getFullName()+"\n";
	}

	@Override
	public double getprixLivraison() {
		// TODO Auto-generated method stub
	return 3.00;
		
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
	return "LIVRAISON STANDARD";
	}

//	
//	public void AfficherLivraisonStandard(double prixLivraison, String Info) {
//		this.prixLivraison = prixLivraison;
//		this.Info = Info;
//		
//		System.out.println(this.Info);
//		System.out.println("");
//		System.out.println("FRAIS DE LIVRAISON : " + this.prixLivraison + "€");
//	}
//	

		
		
		
		
}
