package basicof2dArray;

import java.util.Scanner;

public class inputoutput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows = s.nextInt();
		System.out.println("enter no of colm");
		int colm = s.nextInt();
		
		int a[][] = new int[rows][colm];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				System.out.println("enter no row"+ " " +i+  "enter no colms"+ " "+j);
				a[i][j] = s.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				
				System.out.print(a[i][j]+  " ");
			}
			System.out.println();
		}
	}

}
