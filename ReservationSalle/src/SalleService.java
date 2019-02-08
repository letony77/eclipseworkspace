import java.util.*;

public class SalleService implements Isalle<Salle>{
	
	
	List<Salle> Salles = new ArrayList<Salle>();

	@Override
	public boolean cree(Salle o) {
		
		return Salles.add(o);
	}

	@Override
	public boolean modifier(Salle o) {
		for (Salle s : Salles){
			if(s.getId() == o.getId())
				s.setCode(o.getCode());
				s.setLibelle(o.getLibelle());
				return true;
		}
			return false;
		}


	@Override
	public boolean supprimer(Salle o) {
		// TODO Auto-generated method stub
		return Salles.remove(o);
	}

	@Override
	public List<Salle> findAll() {
		// TODO Auto-generated method stub
		return Salles
				;
	}

	@Override
	public Salle findById(int Id) {
		for (Salle s : Salles)
			if (s.getId() == Id)
				return s;
		// TODO Auto-generated method stub
		return null;
	}

}
