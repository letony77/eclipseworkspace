package cinema;
import java.util.Scanner;

	public class facturebillet {
		public static void main (String []args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Combien de billet souhaitiez vous acheter ? ");
			
			int nbrebillet = -1;
			
			do {
			nbrebillet = sc.nextInt();
			
			for (int i= 0 ; i <= nbrebillet ; i++); {
				
				
			System.out.println("Quel age avez vous ? ");
			int ageclient = sc.nextInt();
			
			System.out.println("Habitez vous à montreuil ? (1) Oui (2) Non ");
			int resiclient = sc.nextInt();
			
			if (ageclient <= 3) {
				System.out.println("Le billet est gratuit ! ");
			}
				else if (ageclient <= 3 && ageclient <= 60 && resiclient == 1) {
				System.out.println ("Le billet est a 5 euro");	
			}
				else if (ageclient <= 3 && ageclient <= 60 && resiclient == 2) {
				System.out.println("Votre billet est a 8 euro ");
			}
				else 
				System.out.println("Votre billet est a 4 euro ");
		
			}
			
			while (nbrebillet < 0) {
				System.out.println(" voici votre facture " + nbrebillet);
			}
			
	}
		
}
