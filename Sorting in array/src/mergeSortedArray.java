
public class mergeSortedArray {
	
	
	public static void mergeSort(int a[], int b[] ,int c[] ,int n, int m, int l) {
		int i=0;
		int j=0; 
		int k =0;
		
		while(i<n&&j<m) {
			
			if(a[i]<=b[j]) {
				
				c[k] = a[i];
				i++;
				k++;
			}
			else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			c[k] = a[i];
			i++;
			k++;
		}
		while(j<m) {
			c[k] = b[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
	int a[] = {2,5,7,9 ,11};
	int b[] = {1,4, 6,12,45};
	int n= a.length;
	int m= b.length;
	int l = n+m;
	int c[] = new int[l];
	mergeSort(a, b , c, n, m, l);
	
	for(int k=0; k<l; k++) {
		System.out.println(c[k]);
	}

	}

}
