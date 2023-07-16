package whileloop;

import java.util.Scanner;

public class print1ton {
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	
	int i = 1;
	while(i<=n) {
		System.out.print(i);
		i++;
	}		
}
