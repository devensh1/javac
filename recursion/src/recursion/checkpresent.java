package recursion;

public class checkpresent {
	
	public static boolean checkpresent(int input[], int x, int startindex) {
		if(startindex>=input.length-1) {
			return true;
		}
		if(input[startindex]==x) {
			return true;
		}
		
	  boolean res= checkpresent(input , x, startindex+1);
		  if(res) {
			  return true;
		  }
		  else {
			  return false;
		  }
		}	
	

	public static void main(String[] args) {
		int input[] = {2,8,-5,9,9};
		int x = 7;
		boolean rev = checkpresent(input, x, 0);
		System.out.print(rev);

	}

}
