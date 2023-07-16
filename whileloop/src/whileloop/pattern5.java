package whileloop;

public class pattern5 {

	public static void main(String[] args) {
		int n =5;
		
		int i =1;
		int val = 1;
		while(i<=n) {
			int space = 1;
			while(space <=n-i) {
				System.out.print(" ");
			}
			int j =1;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
		}
		System.out.println();
		i++;

	}

}
