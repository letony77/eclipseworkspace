public class RunIntroduction {
		public static void main(String [] args) {
			Animal animalTiti = new Animal("titi" , 2);
			animalTiti.parler();
			Animal animalMinet = new Animal("gros minet", 4);
			animalMinet.parler();
			Animal.afficherNombreDAnimaux();
		}
	}