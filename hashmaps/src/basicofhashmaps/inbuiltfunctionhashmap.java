package basicofhashmaps;

import java.util.HashMap;
import java.util.Set;

public class inbuiltfunctionhashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("trees", 10);
		map.put("graph", 20);
		map.put("akash", 12);
		
		int v = map.get("graph");
		System.out.println(v);
		//map.remove
		//System.out.println(map.get(10));
		if(map.containsKey("trees")) {
			System.out.println("the given is preseent");
		} 
		System.out.println(map.remove("trees", 10));
		//iterate;
		Set<String> keys = map.keySet(); 
		for(String s: keys) {
			System.out.println(s);
		}
		
	}

}
