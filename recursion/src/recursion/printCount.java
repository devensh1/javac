package recursion;

public class printCount {
	
	public static int countdigit(int n) {
		if(n==0) {
			return 0;
		}
		return 1+countdigit(n/10);
	}

	public static void main(String[] args) {
		int n =40256;
		int res =countdigit(n);
		System.out.print(res);

	}

}
