package whileloop;

import java.util.Scanner;

public class sumofnnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		int sum =0;
		while(i<=n) {
			sum = sum +i;
			System.out.print( " sum of the given no:");
		}
}

}
