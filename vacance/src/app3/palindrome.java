
package app3;
import java.util.Scanner;
public class palindrome {
	 public static void main(String args[])
	   {
	      String original, inverse = "";
	      Scanner sc = new Scanner(System.in);
	     
	      System.out.println("Insérer une chaine de caractére pour savoir si il sagit d'un palindrome.");
	      original = sc.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         inverse = inverse + original.charAt(i);
	         
	      if (original.equals(inverse))
	         System.out.println("Cette chaine est un palindrome.");
	      else
	         System.out.println("Cette chaine n'est pas un palindrome.");
	         
	   }
}      

