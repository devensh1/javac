package stringFunction;

public class reversee {
public static String reverse(String s1) {
		
		int startindex = 0;
		String ans = "";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				int endIndex = i-1;
				String rev = "";
				for(int j= startindex; i<=endIndex; i++) {
					rev = s1.charAt(j)+rev;
				}
				ans = ans+ rev  + " ";
				startindex = i+1;
			}
			
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s1 = "abc bdc efg";
		
		String an= reverse(s1);
		System.out.print(an);

	}

}
