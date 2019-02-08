import java.util.*;

public class LaunchSalle {
	
	public static void main(final String[] args) {
		
		
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Souhaitiez vous modifier ou supprimer des salles sur la liste ? (1) OUI (2) NON ");
		int Choix = sc3.nextInt();
		
		
		
		if (Choix == 1) {
		Scanner sc = new Scanner(System.in);
		SalleService ListSalle = new SalleService();

		ListSalle.cree(new Salle(1, 2612, "Salle 1"));
		ListSalle.cree(new Salle(2, 2412, "Salle 2"));
		ListSalle.cree(new Salle(3, 9232, "Salle 3"));
		ListSalle.cree(new Salle(6, 2312, "Salle 6"));
		ListSalle.cree(new Salle(4, 1812, "Salle 4"));
		ListSalle.cree(new Salle(9, 1234, "Salle 9"));
		ListSalle.cree(new Salle(7, 2345, "Salle 11"));
		
		
		
		Collections.sort(ListSalle.findAll(), Salle.IdComparator);

		System.out.println("Liste des salles réserver :");
		
		for (Salle s : ListSalle.findAll()) {
			System.out.println("");
			System.out.println(s);
		}
			System.out.println("");
			System.out.println("**********************************************");
			System.out.println("Veuillez saisir l'id de la salle à supprimer. ");
			System.out.println("**********************************************");
			int idSelect;
			idSelect = sc.nextInt();
			Salle salle = ListSalle.findById(idSelect);
			System.out.println("La salle avec l'id " + salle + " est SUPPRIMER. ") ;
			ListSalle.supprimer(ListSalle.findById(idSelect));
			
			System.out.println("");
			System.out.println("*********************************************");
			System.out.println("Veuillez saisir l'id de la salle à modifier. ");
			System.out.println("*********************************************");
			int idSelect2;
			idSelect2 = sc.nextInt();
			Salle salle2 = ListSalle.findById(idSelect2);
			System.out.println("Salle à modifier : " + salle2);
			
			Scanner newCode = new Scanner(System.in);
			System.out.println("*********************************************");
			System.out.println("Veuillez saisir le nouveau code de la salle. ");
			System.out.println("*********************************************");
//			int newCode = sc.nextInt();
			salle2.setCode(newCode.nextInt());
			System.out.println("************************************************");
			System.out.println("Veuillez saisir le nouveau libelle de la salle. ");
			System.out.println("************************************************");
			Scanner newLibelle = new Scanner(System.in);
			salle2.setLibelle(newLibelle.nextLine());
			ListSalle.modifier(salle2);
			
			System.out.println("***************************************************");
			System.out.println("Voici la liste des salles suite à la modification. ");
			System.out.println("***************************************************");
			for (Salle s : ListSalle.findAll())
			System.out.println(s);
		
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("");
//			System.out.println("Veuillez choisir l'id de la salle : ");
//			
//			int idSelect;
//			idSelect = sc.nextInt();
			
			
		}
	
		else
			System.out.println("*********************************************************");
			System.out.println("Relancez pour supprimer ou modifier la liste des salles. ");
			System.out.println("*********************************************************");
	}
}

