package cinema;
import java.util.Scanner;

	public class billet {
	
			Scanner sc = new Scanner(System.in);
	
			int nbreBillets;
		public int nbreBillets() {
			
			System.out.println("Combien de billet souhaitiez vous avoir ? ");
			int nbreBillets = -1;
			
			do 
			{
				nbreBillets = sc.nextInt();
				
			}
			
			while (nbreBillets < 0);
			return nbreBillets;
				
		}
		
		int resident;
		
		public void resident() {
			
			System.out.println("Etes vous resident de Montreuil ? (O)ui ou (N)on ");
			char reponse = sc.nextLine().charAt(0);
			
			switch (reponse) {
			
			case 'o': afficheragem();
			break;
			case 'n': afficherage();
			break;
			}
		}
		
			public void afficheragem()
			{
			System.out.println("Dans quelle trange d'age etes vous ?");
			System.out.println("Vous avez - 3 ans (1)");
			System.out.println("Vous avez entre 3 ans et 60 ans (2)");
			System.out.println("Vous avez plus de 60 ans (3)");
			
			}
			
			public void afficherage()
			{
			System.out.println("Dans quelle trange d'age etes vous ?");
			System.out.println("Vous avez - 3 ans (1)");
			System.out.println("Vous avez entre 3 ans et 60 ans (2)");
			System.out.println("Vous avez plus de 60 ans (3)");
			
			}
			
			public int agem() {
				afficheragem();
				int agem = sc.nextInt();
				return agem;
			}
			
			public int age() {
				afficherage();
				int age = sc.nextInt();
				return age;
			}
			
			public void runfactures() {
			
				
				}
			
			}
			public void runfacture() {
			int nbr = nbreBillets();
			for (int i = 0 ; i < nbr; i++) {
				runfactures();
			}
			
			}
			
			
	}
