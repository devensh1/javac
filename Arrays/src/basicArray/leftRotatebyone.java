package basicArray;

public class leftRotatebyone {
	
	public static int[] leftRotatebyone(int a[]){
		int n = a.length;
		
		int temp = a[0];
		for(int i=0; i<n-1; i++) {
			a[i] = a[i+1];
		}
		a[n-1] =temp;
		return a;
	}
	public static int[] leftrotatebytwo(int a[]){
		int n = a.length;
		
		int temp = a[0];
		for(int i=0; i<n-1; i++) {
			a[i] = a[i+1];
		}
		a[n-1] =temp;
		return a;
	}
	

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		leftRotatebyone(a);
		
		leftrotatebytwo(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
		

	}

}
