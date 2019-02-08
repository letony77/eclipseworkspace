
public class essaiAmi {

	public static void main (String[]args) {
		
		Personne personneSeul = new Personne("Suzanne");
		Personne ami1 = new Personne("Marc");
		Personne ami2 = new Personne("Francois", ami1);
		
		ami1.setAmi(ami2);
		
		
		System.out.println(personneSeul);
		System.out.println(ami1);
		System.out.println(ami2);
	}
}
