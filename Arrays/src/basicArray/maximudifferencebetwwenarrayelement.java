package basicArray;

public class maximudifferencebetwwenarrayelement {
	
	
	public static int maximumdifference(int a[]) {
		int n = a.length;
		int res = 1;
		for(int i=0; i<n; i++) {
			for(int j =i+1; j<n; j++) {
				
				if(a[j]>a[i]) {
					int diff = a[j] - a[i];
					res = Math.max(res, diff);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int a[] = {2,11,10,6,4,8,1};
		int ans =maximumdifference(a);
		System.out.print(ans);
	}

}
