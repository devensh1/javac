package basicofhashmaps;

import java.util.HashMap;

public class intersectionArrayUsinghashmap {
	
	public static void printIntresection(int a1[], int a2[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a1.length; i++) {
			if(map.containsKey(a1[i])) {
				int value = map.get(a1[i]);
				map.put(a1[i], value+1);
			}
			else {
				map.put(a1[i], 1);
			}
		}
		for(int i=0; i<a2.length; i++) {
			if(map.containsKey(a2[i])) {
				int freq  = map.get(a2[i]);
				if(freq>0) {
					System.out.print(a2[i]+ " ");
					map.put(a1[i], freq-1);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int a1[] = {1,4,5,2,2,3,6,5,3,2};
		int a2[] = {0,2,3,2,6,6,5,1};
		
		printIntresection(a1, a2);
		
	}

}
