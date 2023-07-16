package stringFunction;

public class checkPalindrome {
	
	public static void checkpalindrome(String s1) {
		String ans ="";
		for(int i=0; i<s1.length(); i++) {
			ans = s1.charAt(i) + ans;
		}
		
		if(ans.equals(s1)) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("not palindrome");
		}
	}

	public static void main(String[] args) {
		String s1 = "abba";
		checkpalindrome(s1);

	}

}
