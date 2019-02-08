import java.util.Scanner;
		
		public class moyenne 
{
			
				Scanner sc = new Scanner(System.in);
			
			
				int notemax;
			public void notemax() {
				
				System.out.println("Veuillez saisir votre note max :");
				notemax = sc.nextInt();
				System.out.println("votre note max est " +notemax);
			
			
			}
				int notemin;
			public void notemin() {
				System.out.println("Veuillez saisir votre note min : ");
				notemin = sc.nextInt();
				System.out.println("votre note min est : " + notemin);
			
				
			}
			
			/*
				int nbredenote;
			public int nbredenote() 
			{
				int nbredenote = -1;
				System.out.println(" Combien de note avez vous ? ");
				do {
					nbredenote = sc.nextInt();
					
					}
				while (nbredenote < 0 );
				return nbredenote;
			}*/
			/*
			public void tanote()
			{
				System.out.println ("Veuillez saisir votre note : ");
			 
			}
			
			public void tamatiere() {
			
				System.out.println("Quelle est la matiére ? ");
				System.out.println("Anglais (1) ");
				System.out.println("Math (2) ");
				System.out.println("Francais (3)");
			}
			
			public int asknote() {
				 tanote();
				 int asknote = sc.nextInt();
				 return asknote;
			}
			
			public int askmatiere() {
				tamatiere();
				int askmatiere = sc.nextInt();
				return askmatiere;
						
			}*/
			
			
			public void affichermoy() {
			System.out.println("Voici votre moyenne " + ((notemax+notemin)/2) );
			
			}
			
			
			public void runmoys()
			{
				notemax();
				notemin();
				affichermoy();
				
				
			}
			
			
}

		
				

	


