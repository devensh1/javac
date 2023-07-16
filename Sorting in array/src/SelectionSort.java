
public class SelectionSort {

	
	public static void Selectionsort(int a[]) {
		int n =a.length;
		for(int i=0; i<n-1; i++) {
			int min = a[i];
			for(int j = i+1; j<n; j++) {
				if(a[j]<a[min]) {
					min = i;
					int temp = a[min];
					a[min] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {2, 3, 45 ,67, 1,5};
		
		Selectionsort(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
