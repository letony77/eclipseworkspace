package exercicetest;

import java.util.*;

public class Personne implements Ipersonne

{
	public int id;
	public String Nom;
	public String Prenom;
	public Date DateNaiss = new Date();
	public double Salaire;
	public Profil profil;
	/*public String libelle;*/
	
	public Personne(int id, String Nom, String Prenom, Date DateNaiss, Double Salaire, /*String libelle,*/ Profil profil)
			{
				super();
				this.id = id;
				this.Nom = Nom;
				this.Prenom = Prenom;
				this.DateNaiss = DateNaiss;
				this.Salaire = Salaire;
				/*this.libelle = libelle;*/
				this.profil = profil;
			}
	
	
	
	@Override
			public void affiche() 
			{
				// TODO Auto-generated method stub
			
				System.out.println("Je suis le " + profil.libelle + " je m'appelle " + this.Nom + this.Prenom + ". Mon salaire mensuel est de " + this.Salaire + " €");
			}

	@Override
			public double calculerSalaire()
			{
				// TODO Auto-generated method stub
				
			
			int salaireDG = (int) (this.Salaire * 0.2);
			int salaireEM = (int) (this.Salaire* 0.1);
			int salaireT = (int) (salaireDG + this.Salaire);
			int salaireE = (int) (salaireEM + this.Salaire);
			
			if (profil.code == "DG") {
			
				/*System.out.println("Mon salaire est de " + this.Salaire + " €" );*/
				System.out.println("Grace à ma prime de 20 % je gagne " + (salaireDG) + " €.");
				System.out.println("Donc mon salaire est de " + salaireT + " €. ");
			}
			else if(profil.code == "EM") {
			/*	System.out.println("Mon salaire est de " + this.Salaire + " €" );*/
				System.out.println("Grace à ma prime de 10 % je gagne " + (salaireEM) + " €.");
				System.out.println("Donc mon salaire est de " + salaireE + " €. ");
			}
			else System.out.println("blablabla");
				return 0;
			}
}
