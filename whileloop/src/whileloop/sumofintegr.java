package whileloop;

import java.util.Scanner;

public class sumofintegr {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i =1;
		int sum = 0;
		while(i<=n) {
			sum = sum + i;
		}
		if(i==n) {
			System.out.print(sum);
		}

	}

}
