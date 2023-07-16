package basicArray;

public class maximumdifferenceefficientsol {
	
	public static int maximumdifference(int a[]) {
		int n =a.length;
		int res = 1;
		//minvalue is used to track lowest elment in array //
		int minvalue = a[0];
		for(int j=1; j<n; j++) {
			if(a[j]> minvalue) {
				int diff = a[j] - minvalue;
				res = Math.max(res, diff);
				//track the lowest minvalue in array
				minvalue = Math.min(minvalue, a[j]);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int a[] = {2,3,10,6,4,8,1};
		int ans = maximumdifference(a);
		System.out.print(ans);

	}

}
