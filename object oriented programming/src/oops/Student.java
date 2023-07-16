package oops;

public class Student {
	
	int rollnumber;
	String name;
	private int age ;
	
	public static void print() {
		System.out.println("this is wrong");
	}
	
	public int getage() {
		return age;
	}
	
	//this keywoerd is used to stored current variable ;
	public void setage(int age) {
		this.age = age;
	}
	
}
