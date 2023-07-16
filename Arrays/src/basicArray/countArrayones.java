package basicArray;

public class countArrayones {
	
	public static int countArray(int a[]) {
		
		int count =0;
		int i=0;
		int res =1;
		while(i<a.length) {
			if(a[i]==1) {
				count++;
				i++;
			}
			else {
				count=0;
				i++;
			}
			res = Math.max(res, count);
		}
		return res;
	}

	public static void main(String[] args) {
		int a[] = {1,0,1,1,1,0,0,1,1,1,1};
		int res= countArray(a);
		System.out.print(res);

	}

}
