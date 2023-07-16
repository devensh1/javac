package whileloop;

import java.util.Scanner;

public class checknumberisprime {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i=2;
		while(i<=n-1) {
			if(n%i==0) {
				System.out.print("not prime");
				return;
			}
			i++;
			if(i==n) {
				System.out.print("the given is prime"+ n);
			}
		}

	}

}
