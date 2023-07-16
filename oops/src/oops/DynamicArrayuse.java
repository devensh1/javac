package oops;
import java.util.ArrayList;


public class DynamicArrayuse {
	public static void main(String[] args) {
	DynamicArray d = new DynamicArray();
	for(int i =1; i<100; i++) {
		d.add(i+1);
	}
	System.out.println(d.add());
	
	}
}
