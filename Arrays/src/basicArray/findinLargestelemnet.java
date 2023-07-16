package basicArray;

public class findinLargestelemnet {
	
	public static int findingLargestelement(int a[]) {
		//min value function used for smallestinfinityvalue in iteger;
		int max = Integer.MIN_VALUE; 
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		int a[] = {12,34,23,78};
		
		int res =findingLargestelement(a);
		System.out.print(res);

	}

}
