package basicArray;

import java.util.Scanner;

public class ArrangeArrayElemnet {
	
	public static int[] takeInput() {
		
		
		int arr[] = new int[5];
		int count = 1;
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			arr[low] = count;
			low++;
			count++;
			arr[high] = count;
			count++;
			high--;
		}
		return arr;
		
	}
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = takeInput();
		print(arr);

	}

}
