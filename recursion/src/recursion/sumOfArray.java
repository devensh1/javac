package recursion;

public class sumOfArray {
	
	public static int Sumofarray(int a[], int start) {
		
		if(start==a.length) {
			return 0;
		}
		
		return a[start]+ Sumofarray(a , start+1);
		
	}

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		int res= Sumofarray(a, 0);
		System.out.print(res);

	}

}
