package app2;
import java.util.Scanner;
public class segment
{
	
	public static void main (String[]args) 
	{
		
		int ext1 , ext2 , point, longueur;
		Scanner sc = new Scanner (System.in);
		System.out.println("Veuillez entrer ext1");
		ext1 = sc.nextInt();
		
		System.out.println("Veuillez entrer ext2");
		ext2 = sc.nextInt();
		
		System.out.println("Veuillez entrer un point ");
		point = sc.nextInt();
		longueur = (ext2 - ext1);
		
		System.out.println("La longueur du segment est de : " + Math.abs(longueur));
	
		if (ext1 > ext2) {
		int temp = ext1;
		ext1= ext2;
		ext2= temp;	
		}
		
		if (ext1 <= point && point <= ext2) 
		{
			System.out.println(point + " appartient au segment. ");
		}
		else 
		{
			System.out.println(point + " n'appartient pas au segment");
		}
		
		
	}
	
}

	
	


