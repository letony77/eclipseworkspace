import java.util.*;
import java.util.Comparator;
public class Stagiaire /*implements Comparable<Stagiaire>*/ {

	public String Nom;
	public int id;
	public int age;
	
	
public String getNom() {
		return Nom;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
	
	
	public Stagiaire(String Nom, int id, int age) {
		
		this.Nom = Nom;
		this.id = id;
		this.age = age;
	}
	
	public String toString() {
		return "id = " + this.id + ", name = " + this.Nom + ", age = " + this.age;
		
	}
	
	public static Comparator<Stagiaire> ageComparator = new Comparator<Stagiaire>() {
		
		@Override
		public int compare(Stagiaire o1, Stagiaire o2) {
			int age1 = o1.getAge();
			int age2 = o2.getAge();
			// TODO Auto-generated method stub
			return age1 - age2;
		}
	};
	
	public static Comparator<Stagiaire> idComparator = new Comparator<Stagiaire>() {
		
		@Override
		public int compare(Stagiaire o1, Stagiaire o2) {
			int id1 = o1.getId();
			int id2 = o2.getId();
			
			return id1-id2;
		}
	};

	public static Comparator<Stagiaire> nomComparator = new Comparator<Stagiaire>() {
		
		@Override
		public int compare(Stagiaire o1, Stagiaire o2) {
			// TODO Auto-generated method stub
			String nom1= o1.getNom();
			String nom2= o2.getNom();
			return nom1.compareTo(nom2);
		}
	};
	
/*	@Override
public int compareTo(Stagiaire s) {
		
		if (!this.Nom.equals(s.Nom))
			return this.Nom.compareTo(s.Nom);
		
		
	return 0;
	}*/


}
