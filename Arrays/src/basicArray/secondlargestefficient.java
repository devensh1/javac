package basicArray;

public class secondlargestefficient {
	
	
	public static int secondLargest(int a[]) {
		int secondL = -1;
		int largest = 0;
		for(int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				secondL  = largest;
				largest = i;
			}
			
			else if(a[i]!=a[largest]) {
				if(secondL==-1 || a[i]>a[secondL]) 
					secondL =i;
				
			}
		}
		return secondL;
		
	}

	public static void main(String[] args) {
		int a[] = {5,8,6,10,20,25};
		
		int res = secondLargest(a);
		System.out.print(res);

	}

}
