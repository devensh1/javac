package recursion;

public class sumOFnaturalnum {
	
	public static int sumOfnumb(int n) {
		if(n==1) {
			return 1;
		}
		return n+ sumOfnumb(n-1);
	}
	public static void main(String[] args) {
		int n =5;
		int res =sumOfnumb(n);
		System.out.print(res);

	}

}
