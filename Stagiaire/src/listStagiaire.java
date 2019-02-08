import java.util.Map.Entry;
import java.util.*;

public class listStagiaire {
	public static void main(final String[] args) {
//		HashMap<Stagiaire> testStagiaire = new HashMap<Stagiaire>();
		List<Stagiaire> testStagiaire = new ArrayList<Stagiaire>();

		testStagiaire.add(new Stagiaire("Jean.L", 225, 25));
		testStagiaire.add(new Stagiaire("Frand.D", 100, 27));
		testStagiaire.add(new Stagiaire("Alain.J", 220, 20));
		testStagiaire.add(new Stagiaire("Victor.T", 150, 22));

		System.out.println("---- Liste d'origine ----");
		
		for (Stagiaire s : testStagiaire)
			System.out.println(s);
			System.out.println("");
//premiere liste avec le tri avec l'age.
		Collections.sort(testStagiaire, Stagiaire.ageComparator);

		System.out.println("---- Liste trier par age ----");
		
		for (Stagiaire s : testStagiaire)
			System.out.println(s);
			System.out.println("");
//premiere liste avec le tri avec l'id.		
		Collections.sort(testStagiaire, Stagiaire.idComparator);
		
		System.out.println("---- Liste trier par id ----");
		
		for (Stagiaire s : testStagiaire)
			System.out.println(s);
			System.out.println("");
//premiere liste avec le tri avec le nom.		
		Collections.sort(testStagiaire, Stagiaire.nomComparator);
		
		System.out.println("---- Liste trier par nom ----");
		for (Stagiaire s : testStagiaire)
			System.out.println(s);
			System.out.println("");
	}
}



