package stack;

public class StackUsingArray {
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		int data[] = new int[10];
		topIndex = -1;
	}
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex=-1;
	}
	
	public int pop() throws Stackemptyexception{
		
		if(topIndex==-1) {
			//throws
			throw new Stackemptyexception();
		}
		
		int temp = data[topIndex];
		topIndex--;
		return temp;
		
	}
	
	public int top() throws Stackemptyexception {
		if(topIndex== -1) {
			throw new Stackemptyexception();
		}
		
		return topIndex;
		
	}
	
	public boolean isEmpty() {
		if(topIndex==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int elem)throws Stackfullexception {
		if(topIndex== data.length-1) {
			throw new Stackfullexception();
		}
		
		topIndex++;
		data[topIndex] = elem;
		
	}
	
	public int size() {
		return topIndex+1;
	}
}
