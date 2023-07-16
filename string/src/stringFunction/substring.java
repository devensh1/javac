package stringFunction;

public class substring {
	
	public static void Substrong(String s1) {
		for(int i=0; i<s1.length(); i++) {
			for(int j=i; j<s1.length(); j++) {
				
				//in string sunstring basically a[i+j] = s1.substring(i, j+1);
				System.out.println(s1.substring(i,j+1));
			}
		}
		
	}

	public static void main(String[] args) {
		String s1 = "pqrs";
		Substrong(s1);

	}

}
