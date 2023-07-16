package basicArray;

public class movesAllzerotoend {
	
	public static int[] moveszeroend(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==0) {
				 if(a[j]!=0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] =temp;
				}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = {8,5,0,10,0,20};
		
		moveszeroend(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
