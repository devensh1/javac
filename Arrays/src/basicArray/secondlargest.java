package basicArray;

public class secondlargest {
	
	public static int largest(int a[]) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int secondlargest(int a[]) {
		
		int slargest = -1;
		int v = largest(a);
		for(int i=0;i<a.length; i++) {
			if(a[i]!= a[v]) {
				//update slargest element in array//
				 if( slargest ==-1||a[i]> a[slargest]) {
					slargest = i;
				}
			}
		}
		return slargest;
	}
	
	

	public static void main(String[] args) {
		int a[] = {10,5,8,20};
		
		int res = largest(a);
		System.out.println("the first largest elemet is = " + res);
		int ans= secondlargest(a);
		System.out.println(ans);

	}

}
