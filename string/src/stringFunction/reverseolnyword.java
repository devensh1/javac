package stringFunction;

public class reverseolnyword {
	
	public static String reverseword(String s1) {
		int n = s1.length();
		int startIndex = n-1;
		String ans ="";
		for(int i = n-1; i>=0; i--) {
			if(s1.charAt(i)==' ') {
				int endIndex = i+1;
				String rev ="";
				for(int j = startIndex; j>=endIndex; j--) {
					
					
					rev = s1.charAt(j)+ rev;
				}
				
				ans = ans + rev + " ";
				startIndex = i-1;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s1 = " welcome to gef";
		String fi = reverseword(s1);
		System.out.print(fi);

	}

}
