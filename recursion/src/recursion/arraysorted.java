package recursion;

public class arraysorted {
	
	public static boolean ArraySorted(int a[]) {
		if(a.length<=1) {
			return true;
		}
		
		int smallArray[] = new int[a.length-1];
		for(int i=1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		ArraySorted(smallArray);
		 if(!ArraySorted(smallArray)) {
			return false; 
		 }
		 
		
		if(a[0]<=a[1]) {
			return true;
		}
		else {
			return false;
		}
	
		 
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 1,6,7};
		 boolean b = ArraySorted(a);
		 System.out.print(b);

	}

}
