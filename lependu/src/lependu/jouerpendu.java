package lependu;

import java.util.Scanner;

public class jouerpendu {
	Scanner sc = new Scanner(System.in);

	int choix;
	int choixmot;
	char[] tabMot;
	
	public void joueroupas() {
		System.out.println("Voulez vous jouer au pendu ? (1)Oui (2) Non");
		int choix = sc.nextInt();

		if (choix == 1) {
			bienvenue();
			choixmot();
			/*jeu();*/

		}

		else if (choix == 2) {
			System.out.println("Merci à bientot ! ");
		} else {
			System.out.println("Veuillez insérer (1) ou (2) relancez !!");
		}
	}

	public void bienvenue() {
		System.out.println("----------BONJOUR------------");
		System.out.println("-VOUS JOUEZ AU JEU DU PENDU--");
		System.out.println("---<(^_^<)<(^_^)>(>^_^)>-----");
		System.out.println("-----------------------------");
	}

	
	

	public void choixmot() {
		Scanner scp = new Scanner(System.in);

		System.out.println("Quel mot souhaitiez vous faire deviner ? ");
		String mot = scp.nextLine();

		int nbLettre = mot.length();
		System.out.println("Le mot à deviner contient " + nbLettre + " lettre.");

		char[] tabMot = mot.toCharArray();
		System.out.println(tabMot);
	}

	public void jeu() {
		System.out.println(tabMot);
	}

}
