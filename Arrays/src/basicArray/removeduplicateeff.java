package basicArray;

public class removeduplicateeff {
	
	public static int removeduplicte(int a[]) {
		int size =1;
		for(int i=1; i<a.length; i++) {
			if(a[i]!=a[size-1]) {
				
				// u used to store current postion in array//
				//a[1] = a[1]
				a[size] =a[i];
				size++;
			}
		}
		return size;
		
	}

	public static void main(String[] args) {
		int a[] = {10,20,20,30,30,40};
		int res =removeduplicte(a);
		System.out.println("size of array"+ res);
		for(int i=0 ; i<res; i++) {
			System.out.print(a[i]+ " ");
		}
		
		

	}

}
