package stringFunction;

import java.util.Scanner;

public class reverseStringf {
	
	
	public static String reverseString(String s1) {
		String ans = "";
		for(int i=0; i<s1.length(); i++) {
			ans = s1.charAt(i)+ ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String res =reverseString(s1);
		System.out.print(res);
	}

}
