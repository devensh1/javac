package recursion;

public class replacedbyb {
	
	public static String replacedElement(String s1, char c1, char c2) {
		if(s1.length()==0) {
			return "";
		}
		
		char c;
		if(s1.charAt(0)==c1) {
			c = c2;
			
		}
		else {
			c = s1.charAt(0);
		}
		
		String smallAns = replacedElement(s1.substring(1), c1, c2);
		return  c + smallAns;
	}

	public static void main(String[] args) {
		String s1 = "babbac";
		char c1 = 'b';
		char c2 = 'x';
		String res= replacedElement(s1, c1, c2);
		System.out.print(res);

	}

}
