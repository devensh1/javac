package basicArray;

public class leaderInArray {
	
	
	public static void leaderelementinarray(int a[]) {
		
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j= i+1; j<n; j++) {
				if(a[i]<= a[j]) {
					break;
				}
				if(a[i]>a[j]) {
					System.out.print(a[i]+ " ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int a[] = {7,10,4,3,6,5};
		leaderelementinarray(a);
 
	}

}
