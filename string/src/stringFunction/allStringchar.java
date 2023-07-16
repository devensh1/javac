package stringFunction;

import java.util.Scanner;

public class allStringchar {
	
	public static void Stringcharprint(String s1) {
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		Stringcharprint(s1);

	}

}
