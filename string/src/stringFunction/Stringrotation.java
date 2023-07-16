package stringFunction;

public class Stringrotation {
	
	public static void stringrotation(String s1, String s2) {
		String s3 = s1+s2;
		if(s3.indexOf(s2)>0) {
			System.out.print("the roatation is present");
		}
		
		
	}

	public static void main(String[] args) {
		String s1 ="abcd";
		String s2 = "cdab";
		stringrotation(s1, s2);

	}

}
