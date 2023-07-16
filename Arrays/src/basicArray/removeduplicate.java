package basicArray;

public class removeduplicate {
	
	public static void removeduplicate(int a[]) {
		int low =0;
		for(int i=1; i<a.length; i++) {
			
			
			if(a[i]!=a[low]) {
				System.out.print(a[low]+ " ");
				low++;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,40,60};
		removeduplicate(a);

	}

}
