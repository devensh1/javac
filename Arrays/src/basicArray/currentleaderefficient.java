package basicArray;

public class currentleaderefficient {
	
	
	public static void leaderelement(int a[]) {
		
		int n= a.length;
		//current variable create fortrack the current leader in array//
		int curr_leader = a[n-1];
		System.out.print(curr_leader+ " ");
		for(int i=n-2; i>=0; i--) {
			if(curr_leader < a[i]) {
				//updated curr-leader//
				curr_leader = a[i];
				System.out.print(a[i]+ " ");
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {7,10,4,3,6,5};
		leaderelement(a);

	}

}
