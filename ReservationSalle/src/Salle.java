import java.util.*;

public class Salle {
	public int Id;
	public int Code;
	public String Libelle;

	public Salle(int Id, int Code, String Libelle) {
		this.Id = Id;
		this.Code = Code;
		this.Libelle = Libelle;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public String toString() {
		return "------NUMERO ID# " + this.Id + "--------" + "\n" + "\n" + "Code de la Salle = " + this.Code + "\n"
				+ "Nom et numero de la Salle = " + this.Libelle;
	}

	public static Comparator<Salle> IdComparator = new Comparator<Salle>() {

		@Override
		public int compare(Salle o1, Salle o2) {
			// TODO Auto-generated method stub
			int Id1 = o1.getId();
			int Id2 = o2.getId();
			return Id1 - Id2;
		}
	};
}