package stringFunction;

public class basicFunctionString {

	public static void main(String[] args) {
		String s1 = "coding";
		String s2 = " is there";
		String s3 = "codin";
		//System.out.println(s1.concat(s2));//
		//System.out.println(s2.length());
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.compareTo(s2));
		//System.out.print(s1.charAt(2));
		System.out.println(s1.contains("ing"));
		
		System.out.println(s1+= s2);
		
		System.out.println(s1.substring(0, 3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.equals(s2));
		
		
	}

}
