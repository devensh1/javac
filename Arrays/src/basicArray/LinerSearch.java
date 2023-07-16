package basicArray;

public class LinerSearch {
	
	public static int LinearSearch(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[] = {23,45,67,23,46};
		int num = 46;
		int res =LinearSearch(arr,num);
		System.out.print(res);

	}

}
