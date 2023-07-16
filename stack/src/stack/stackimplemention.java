package stack;

public class stackimplemention {

	public static void main(String[] args)throws Stackemptyexception, Stackfullexception {
		StackUsingArray stack = new StackUsingArray(100);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		
		int a[] = {10,20,4,6,78};
		for(int i=0; i<a.length; i++) {
			stack.push(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(stack.pop());
		}
		
		
		

	}

}
