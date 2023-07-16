package recursion;

public class factorial {
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		int smallAns = factorial(n-1);
		return n+smallAns;
	}

	public static void main(String[] args) {
		int n =5;
		int res =factorial(n);
		System.out.print(res);

	}

}
