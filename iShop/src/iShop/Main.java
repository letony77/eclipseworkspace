package iShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String DRIVER = "com.mysql.jbdc.Driver";
		String BDPATH ="jdbc:mysql://localhost:3306/Liste_Produit";
		String DBUSER = "Test";
		String DBPASSWORD = "";
		
		/*
		 System.out.println("Quelle action souhaitez-vous effectuer ? ");
    	 System.out.println("A - Afficher tous les éléments de la base de données.");
    	 System.out.println("B - Ajouter une nouvelle donnée.");
		
    	 try {
			Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
		Statement statement =  connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM eCommerce.Liste_Produit");
    	connection.close(); } 
	
	*/
		
	     try {
        	 // chargement du driver de la base de données
        	 Class.forName(DRIVER);
        	 
        	 //créer le connexion JDBC
        	 Connection connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
        	 Statement statement = connection.createStatement();
        	 ResultSet rs = statement.executeQuery("SELECT * FROM eCommerce.Liste_Produit");
        	 
        	 System.out.println("Quelle action souhaitez-vous effectuer ? ");
        	 System.out.println("A - Afficher tous les éléments de la base de données.");
        	 System.out.println("B - Ajouter une nouvelle donnée.");
        	 
        	 String saisie = sc.nextLine();
        	 
        	 if(saisie.equalsIgnoreCase("A")) {
        		System.out.println("Liste actuelle des apprenants : ");
        		 while (rs.next()) {
            		 System.out.println(" - " + rs.getString("ID_Produit") + " : " + rs.getString("Nom_Produit") + " " + rs.getString("Description") + " " + rs.getInt("Prix"));
            	 
             } connection.close(); 
        		
        	 } /*else if(saisie.equalsIgnoreCase("B")) {
        		 System.out.println("Saisissez le nom souhaité : ");
        		 String nom = sc.next();
        		 System.out.println("Vous avez saisi : " + nom);
        		 System.out.println("Saisissez le prénom souhaité : ");
        		 String prenom = sc.next();
        		 System.out.println("Vous avez saisi : " + prenom);
        		 String requete ="INSERT INTO apprenant (prenom, nom) VALUES ('" +prenom+"', '"+nom+"')";

        		 statement.execute(requete);
        		 System.out.println("Enregistrement effectué");
        		 
        	 }
        */
        	
        	
    } catch (Exception e) {e.printStackTrace();
        
    }
	} 

}
