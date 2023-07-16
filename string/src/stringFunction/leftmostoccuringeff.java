package stringFunction;

public class leftmostoccuringeff {
	
	
	public static int leftmostrepeating(String s1) {
		//creating for storing string element in array ascci value form
		int CHAR =256;
		//its just creating array size 0f 256 in tha form of ascii value;
		int count[] = new int[CHAR];
		for(int i=0; i<s1.length(); i++) {
			//its goes on every string ascii value and incress by one;
			count[s1.charAt(i)]++;
		}
		//we goes every elemnt in creating char arra//
		//whether we stored evry string element freeq //
		for(int i=0; i<CHAR; i++) {
			
			//check for whicstring have frequency is greater then 1;
			//mean in array the base of ascii value every element is stiore
			//on the basis f that we check whos frequcny gretaer then 1 and come first is atumatically stored
			//in array form//
			if(count[s1.charAt(i)]>1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String s1 = "abbcc";
		int ans =leftmostrepeating(s1);
		System.out.print(ans);

	}

}
