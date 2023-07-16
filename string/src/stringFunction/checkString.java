package stringFunction;

public class checkString {
	
	
	public static void stringpresent(String s1, String s2) {
		int i=0;
		int j=0;
		int m = s1.length();
		int n = s2.length();
		
		while(i<m &&j<n) {
			if(s1.charAt(i)==s2.charAt(j)) {
				i++;
				j++;
			}
			else {
				j++;
			}
			
	
		if(j==n) {
			System.out.println("hvujjbn");
		}
		else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "ad";
		stringpresent(s1,s2);

	}

}
