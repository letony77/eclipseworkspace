package randomprenom;
import java.util.Random;
public class randomprenom {
	public static void main (String[]args) {
		
		
		
		String [] tab  = {"Tony" , "Hamza" , "Nala" , "Neyer" , "Marie" , "Mafuj" , "Sami" ,"Abdel", "Arthus", "Nabil","Leila", "Coumba", "raed", "Benjamin", "Yann"  } ;
		int i = new Random().nextInt(tab.length);
		System.out.println(tab[i]);
	}
	
}
