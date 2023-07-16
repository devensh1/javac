package recursion;

public class recursionusingString {
	
	
	public static String removeXelement(String s1) {
		if(s1.length()==0) {
			return s1;
		}
		
		String ans = "";
		if(s1.charAt(0)!= 'x') {
			ans = ans + s1.charAt(0);
		}
		String smallAns = removeXelement(s1.substring(1));
		return ans + smallAns;
	}

	public static void main(String[] args) {
		String s1 = "abxbx";
		String res =removeXelement(s1);
		System.out.print(res);

	}

}
