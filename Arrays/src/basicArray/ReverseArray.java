package basicArray;

public class ReverseArray {
	
	public static int[] reverseArray(int a[]) {
		int low = 0;
		int high = a.length-1;
		while(low<=high) {
			
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		return a;
		
	}

	public static void main(String[] args) {
		int a[] = {10,5,7,30};
		reverseArray(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
