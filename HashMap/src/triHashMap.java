import java.util.*;
public class triHashMap {
	public static void main (final String[]args) {
	
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		
	Map<Integer, String> map1 = new TreeMap<Integer, String>(hmap);
	System.out.println( map1);
	
//	for(Integer s : hmap.keySet()) {
//		System.out.println(s);
//	}
//	
//	 System.out.println();
//	 for (String s : hmap.values()) {
//	 System.out.println(s + " ");
//	 }
//	 System.out.println("");
//	 for (Map.Entry<Integer, String> s : hmap.entrySet()) {
//	 System.out.print(s.getKey() + " " +s.getValue() );
//
//	 }
}
}