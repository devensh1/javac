package basicof2dArray;

import java.util.Scanner;

public class inputoutputarray {
	
	public static int[][] takeinput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of rows ");
		int rows = s.nextInt();
		System.out.println("enter number of colms");
		int colm = s.nextInt();
		int a[][] = new int[rows][colm];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				System.out.print("enter no of "+ " " +i+ "enter no col"+ " " +j);
				a[i][j] = s.nextInt(); 
			}
			System.out.println();
		}
		return a;
		
	}
	
	public static void print2dArray(int input[][]) {
		int row = input.length;
		int colm = input[0].length;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<colm; j++) {
				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int input[][] = takeinput();
		print2dArray(input);

	}

}
