package basicArray;

public class movesAllzerotoendeff {
	
	public static int[] movesAllzerotoend(int a[]) {
		int count =0;
	//count variable are sued to track non zero elementt;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i] = a[count];
				a[count] = temp;
				count++;
			}
		}
		return a;
		
	}

	public static void main(String[] args) {
		int a[] = {8,5,10,0,0,20,30};
		movesAllzerotoend(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
