
public class Selectionshort {
	
	
	public static int[] selectionShort(int a[] , int temp[]) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int min_value = 0;
			for(int j =1; j<n; j++) {
				if(a[j] < a[min_value]){
					
					min_value = i;
					temp[i] = a[min_value];
					a[min_value] = 0;
				}
			
			}
			for(int  k=0; k<n; k++) {
				temp[i] = a[k];
			}
		}
		return a;
		
	}


	public static void main(String[] args) {
		int a[] = {10, 5 , 8, 20 ,2,18};
		int n = a.length;
		int temp[] = new int[n];
		selectionShort(a , temp);
		
		for(int k =0; k<n; k++) {
			System.out.println(a[k]);
		}
		}
	}

