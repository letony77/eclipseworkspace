package lependu;
import java.util.Scanner;
		public class penduexemple 
{
			public static void main (String[]args)
			{
				Scanner sc = new Scanner(System.in);
				
		
				System.out.println("Souhaitez vous jouer au Pendu ?(1)Oui (2)Non");
				int choix = sc.nextInt();
				
						
						
				switch (choix){
				
				case 1:
					
					System.out.println("-----------------------------");
					System.out.println("-----BIENVENUE AU PENDU------");
					System.out.println("-----------------------------");
									
					
					System.out.println(" Quel mot voulez-vous faire deviner ?");	

				
					Scanner scp = new Scanner(System.in);
					String mot = scp.nextLine();
				int nbLettre = mot.length();	
					System.out.println("Le mot à deviner est composé de "+nbLettre+" lettres.");
					System.out.println("");
			 
				
				char[] tableauLettre = mot.toCharArray();
				
				System.out.println("Voici les régles : ");
				System.out.println("Vous avez 6 vie ");
				System.out.println("Vous devez insérer des lettre afin de trouver le mot");
				
				char l;
				int vie = 0;
				
				
				
				default:
					System.out.println("Merci à bientot !");
				
				}
			}
				
			
}

			
			
 