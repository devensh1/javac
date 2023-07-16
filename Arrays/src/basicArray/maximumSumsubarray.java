package basicArray;

public class maximumSumsubarray {
	
	public static int maximumSumSubarray(int a[]) {
		int n = a.length;
		
		int res =a[0];
		for(int i=0; i<n; i++) {
			int curr =0;
			for(int j= i; j<=n; j++) {
			curr = curr + a[i];	
			res = Math.max(res, curr);
			}
			
		}
		return res;
	}
	public static void main(String[] args) {
	int a[] = {5,3,4,5,6};
	int ans =maximumSumSubarray(a);
	System.out.print(ans);

	}

}
