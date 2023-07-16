package recursion;

public class findelement {
	
	public static int findelement(int a[], int x, int start) {
		if(start==0) {
			return -1;
		}
		
		if(a[start]==x) {
			int output[] = new int[a.length];
			int i = output.length;
			output[i] = a[start];
			start++;
		}
		return findelement(a, x, start-1, output);
		
		
	}

	public static void main(String[] args) {
		int a[] = {2, 5,6,6,9,8};
		int x = 6;
		int res =findelement(a, x, a.length-1);
		System.out.print(res);

	}

}
