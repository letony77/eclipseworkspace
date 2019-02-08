package lependu;
import java.util.Random;
	public class pendu {
	
		
		
		public String choisirmot() {
		
			String[]tab = {"Bonjour", "Aurevoir", "Merci"};
			int mot = new Random().nextInt(tab.length);
			String mots = tab[mot];
			return mots;
			
		}
	
		
	}

