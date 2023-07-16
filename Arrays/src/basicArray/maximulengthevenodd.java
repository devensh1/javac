package basicArray;

public class maximulengthevenodd {
	
	
	public static int maximumlengtheven(int a[]) {
		
		int res =1;
		int n =a.length;
		int i=1;
		int curr=1;
		while(i<n) {
			if((a[i]%2==0&&a[i-1]%2!=0) || (a[i]%2!=0&&a[i-1]%2==0)) {
				curr++;
				i++;
				res = Math.max(res, curr);
			}
			else {
				curr=1;
				i++;
			}
		
		}
		return res;
		
	}

	public static void main(String[] args) {
		int a[] = {10,3,8,5,4,4,11};
		
		int ans =maximumlengtheven(a);
		System.out.print(ans);

	}

}
