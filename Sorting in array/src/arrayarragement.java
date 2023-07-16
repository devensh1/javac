
public class arrayarragement {
	
	public static void arrayaragment(int a[]) {
		int n = a.length;
		int low = 0;
		int high = n-1;
		int value =1;
		
		for(int i=0; i<n; i++) {
			a[low] = value;
			value++;
			a[high] =value;
			low++;
			high--;
		}
	}
	
	public static void print(int a[]) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = arrayaragment();
		print(a);

	}

}
