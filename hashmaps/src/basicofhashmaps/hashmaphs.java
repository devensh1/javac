package basicofhashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmaphs {
	
	public static ArrayList<Integer> removeduplicate(int arr[]){
		
		ArrayList<Integer> result = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			result.add(arr[i]);
			map.put(arr[i], true);
		}
		return result;
	}
		

	public static void main(String[] args) {
		int arr[] = {10,20,20,34,67,30,30};
		ArrayList<Integer> output = removeduplicate(arr);
		System.out.println(output);

	}

}
