package whileloop;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i =1;
		int val = 1;
		while(i<=n) {
			int space = 1;
			while(space<=n-1) {
				System.out.print(" ");
				space++;
			}
			
			int j =1;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
		}
		System.out.println();
		i = i+1;
	}

}
