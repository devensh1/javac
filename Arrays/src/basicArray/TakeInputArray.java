package basicArray;

import java.util.Scanner;

public class TakeInputArray {

	public static void main(String[] args) {
		//scanner function is used for if u want to anything from user u have to usedd thi//
		Scanner s = new Scanner(System.in);
		//to declaired size of arrayfrom userr//
		int size = s.nextInt();
		//creating array from user
		int arr[] = new int[size];
		//provinding all index element from user;
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		//excute all index element from user//
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
