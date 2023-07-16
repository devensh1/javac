package recursion;

public class recursionOnArray {
	
	public static boolean checkArraySorted(int input[]){
		if(input.length<=1) {
			return true;
		}
		int smallArray[] = new int[input.length-1];
		
		for(int i=1; i<input.length; i++) {
			smallArray[i-1] = input[i];
		}
		boolean ans= checkArraySorted(smallArray);
		if(!ans){
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int input[] = {1,2,1};
		boolean res =checkArraySorted(input);
		System.out.print(res);

	}

}
