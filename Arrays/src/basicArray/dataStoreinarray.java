package basicArray;

public class dataStoreinarray {
	
	//public static void increment(int input[]) {
		//input and a both array refrece the same adrees, same memoring accesig;
		//for(int i=0; i<input.length; i++) {
			//input[i]++;
		//}
	//}
	
	public static void increment(int input[]) {
		//input here can locate difference address
		//different memoring accesing
		input = new int[5];
		for(int i=0; i<input.length; i++) {
			input[i]++;
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,56};
		increment(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
