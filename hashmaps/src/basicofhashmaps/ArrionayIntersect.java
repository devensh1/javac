package basicofhashmaps;

import java.util.Arrays;

public class ArrionayIntersect {
	
	
	public static void printintersection(int a1[], int a2[], int m, int n) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		int i =0;
		int j =0;
		
		while(i<m && j<n) {
			if(a1[i]==a2[j]) {
				System.out.print(a1[i]+ " ");
				i++;
				j++;
			}
			else if(a1[i]<a2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		
	}

	public static void main(String[] args) {
		int a1[] = {2,5,6,8,4,6};
		int a2[] = {3,5,2,8,4,6};
		
		int m = a1.length;
		int n = a2.length;
		printintersection(a1, a2, m, n);
	}

}
