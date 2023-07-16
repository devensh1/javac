package basicArray;

public class leftRotatebytwoeff {
	
	public static int[] leftrotate(int a[], int d) {
		int n = a.length;
		int firstIndex = a[0];
		int secondIndex = a[1];
		for(int i=0; i<=d; i++) {
			a[i] = a[i+2];
		}
		a[n-2] = firstIndex;
		a[n-1] = secondIndex;
		return a;
		
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int d= 2;
		leftrotate(a, d);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
