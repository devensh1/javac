
public class insertionSort {

	public static void insertionSort(int a[]) {
		int n = a.length;
		for(int i=1; i<n; i++) {
			int j = i-1;
			int temp = a[i];
			while(j>=0) {
				if(a[j]>a[temp]) {
					a[j+1] = a[j];
					j--;
				}
			}
			a[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int a[] = {10, 5, 1, 8 , 9, 4};
		insertionSort(a);

		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
