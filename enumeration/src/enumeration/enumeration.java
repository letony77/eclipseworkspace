package enumeration;

public class enumeration {
		enum Jour 
	{
			
			LUNDI, MARDI , MERCREDI , JEUDI , VENDREDI , SAMEDI , DIMANCHE;
			
		static void action (String nom) 
		{
			try {
			Jour jour = Jour.valueOf(nom);
			switch(jour) 
			{
			
			case SAMEDI :
			case DIMANCHE :
				System.out.println("se reposer");
			break;
			
			default :
				System.out.println("travailler");
			}
				
			}
			
			catch (IllegalArgumentException e){
			System.out.println("jour incorrect");
			}
	
			}
		
	}
}
