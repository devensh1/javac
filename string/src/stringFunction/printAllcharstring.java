package stringFunction;

public class printAllcharstring {
	
	public static void printAllchar(String s1) {
		int n = s1.length();
		for(int i=0; i<n; i++) {
			System.out.print(s1.charAt(i) + " ");
		}
	}

	public static void main(String[] args) {
		String s1 = "coding";
	    printAllchar(s1);

	}

}
