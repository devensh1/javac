package recursion;

public class checkArraySorted {
	
	public static boolean checkSorted(int input[], int startIndex) {
		if(startIndex==input.length) {
			return true;
		}
		if(input[startIndex]>input[startIndex+1]) {
			return false;
		}
		boolean resv = checkSorted(input, startIndex+1);
		{
			return resv;
		}
	}

	public static void main(String[] args) {
		int input[] = {10,20,30,40};
		boolean b= checkSorted(input, 0);
		System.out.print(b);

	}

}
