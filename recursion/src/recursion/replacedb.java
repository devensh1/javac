package recursion;

public class replacedb {
	
	public static String replaceb(String s1) {
		
		if(s1.length()==0) {
			return s1;
		}
		
		String ans = "";
		if(s1.charAt(0)=='b') {
			ans = ans + 'x';
		}
		else {
			return s1;
		}
		
		String smallAns = replaceb(s1.substring(1));
		return ans = ans + smallAns;
	}

	public static void main(String[] args) {
		String s1 = "abbcb";
		String res = replaceb(s1);
		System.out.print(res);

	}

}
