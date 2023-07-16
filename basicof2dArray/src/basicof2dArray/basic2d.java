package basicof2dArray;

import java.util.Scanner;
public class basic2d {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("int no of rowa");
		int row = s.nextInt();
		System.out.println("enter no of coloms");
		int colm= s.nextInt();
		int arr[][] = new int[row][colm];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<colm; j++) {
				System.out.println("enetr row"+ "" +i+ " enter no colm"+  " "+j);
				arr[i][j] = s.nextInt();
			}
			
		}
			
			for( int i=0; i<row; i++) {
				for(int j =0; j<colm; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
			
		}

	}

