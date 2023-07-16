package stringFunction;

public class leftmostoccurencindex {
	
	public static int leftmostooccurence(String s1) {
		for(int i=0; i<s1.length(); i++) {
			for(int j=i+1; j<s1.length(); j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		String s1 = "geekforgeeks";
		int ans =leftmostooccurence(s1);
		System.out.print(ans);

	}

}
