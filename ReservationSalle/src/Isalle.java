import java.util.*;
public interface Isalle<T> {
	
	 boolean cree(T o);
	 
	 boolean modifier(T o);
	 
	 boolean supprimer(T o);
	 
	 List<T> findAll();
	 
	 T findById(int Id);

}
