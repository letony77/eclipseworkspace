package four;
import java.util.Scanner;
public class four {
	int capacite;
	int degres;
	String nomAliment;
	int four;
	
	
	public void puissance( String nomAliment, int capacite, int four) {
		this.nomAliment = nomAliment;
		if (capacite <= 30) {
			System.out.println("je cuis" + (String) nomAliment + " avec le four à 180 degrés" );
		}
		else 
			System.out.println("je cuis" + (String)nomAliment + " avec le four à 220 degrés");
		

	}
}
