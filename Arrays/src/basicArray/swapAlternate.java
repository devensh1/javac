package basicArray;

public class swapAlternate {
	
	public static int[] swapAlternate(int a[]) {
		for(int i=0; i<a.length-1; i=i+2) {
			for(int j=i+1; j<=i+1; j=j+2) {
			    int temp = a[i];
			    a[i] =a[j];
			    a[j] =temp;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = {9,3,6,12,14,32};
		
		swapAlternate(a);
		
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+ " " );
		}
		

	}

}
