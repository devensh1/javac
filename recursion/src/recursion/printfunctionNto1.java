package recursion;

public class printfunctionNto1 {
	
	public static void printFunction(int n) {
		
		if(n==0) {
			return ;
		}
		printFunction(n-1);
		System.out.println(n);
		
		
	}

	public static void main(String[] args) {
		int n = 5;
	 printFunction(n);

	}

}
