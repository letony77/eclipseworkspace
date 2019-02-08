package exercicetest;
import java.util.*;
public class Test {

	public static void main (String[]args) {
		
		Date DateNaiss = new Date();
		Profil profils [] = new Profil[2];
		profils[0]= new Profil("DG","Directeur General");
		profils[1]= new Profil("EM","Employé");
		
		Personne DG = new Personne(123 , "Le ", "Tony", null, 2000.0, profils[0]);
		DG.affiche();
		DG.calculerSalaire();
		
		Personne EM = new Personne (123, "Payet ", "Melissa", null, 1234.0, profils[1]);
		EM.affiche();
		EM.calculerSalaire();
	}
	
}
