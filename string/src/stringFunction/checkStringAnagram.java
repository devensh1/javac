package stringFunction;

public class checkStringAnagram {
	
	
	public static void checkAnagram(String s1, String s2) {
		 int CHAR = 256;
		int count[] = new int[CHAR];
		
		if(s1.length()!=s2.length()) {
			System.out.println("the given is not anagram");
		}
		for(int i=0; i<s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i=0; i<CHAR; i++) {
			if(count[i]!=0) {
			
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "aabca";
		String s2 = "acaba";
		
		checkAnagram(s1, s2);

	}

}
