package testMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class map {

	public static void main(final String[]args) {
		
		HashMap<String, String> testMap = new HashMap<String, String>();
		
			testMap.put("1", "Data1");
			testMap.put("2", "Data2");
			testMap.put("4", "Data4");
			testMap.put("3", "Data3");
		
		for (String s : testMap.keySet()) {
			System.out.println(s + " ");
			

		}
		System.out.println("------------------------------");
		for (String s : testMap.values()) {
			System.out.println(s + " ");
			

		}
		System.out.println("------------------------------");
		for (Map.Entry<String, String> s : testMap.entrySet()) {
			System.out.println(s + "");
			
			
		}
	}
}
