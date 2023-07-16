package stringFunction;

public class reverseString {
	
	public static void reverseString(String s1) {
		int low = 0;
		int high = s1.length()-1;
		
		while(low<=high) {
			if(s1.charAt(low)!=s1.charAt(high)) {
				System.out.println(s1+ " the given string is not palindrom");
			}
			else {
				low++;
				high--;
			}
		} 
		System.out.println(s1+ " the given String is palindrom");
	}

	public static void main(String[] args) {
		String s1 = "abba";
		reverseString(s1);

	}

}
