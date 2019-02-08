package tablodevoy;
import java.util.Scanner;

	public class tablo 
	{
		public static void main(String[]args) {
		System.out.println("Veuillez choisir votre lettre à trouver dans le tableau");
		Scanner sc = new Scanner(System.in);
		char choix = sc.nextLine().charAt(0);
		char [] tableau  = {'A','E','I','O','U'};
		boolean contain = false;
			for (int i = 0; i < tableau.length ; i++ )
			{
			
				if (tableau[i] == choix) 
				{
					contain = true;
					System.out.println("La valeur" + choix + "est a l'empalcement" + i );
				}
				else {
					System.out.println("La valeur n'est pas compris dans le tableau");
				}
					
			}
			/*
			if (contain)
			{System.out.println("la lettre " + choix + " est a l'emplacement " + i);}
			
			else 
			{System.out.println("La valeur n'est pas comprise dans le tableau");}
			*/
			}
			
	}
		
