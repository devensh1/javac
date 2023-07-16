package oops;

public class Student {
	String name;
	  int rollNumber;
	  final double d = 0.97;
	 static  int numstudent;
	 
	public Student(String name , int rollNumber) {
		this.name = name;
		this.rollNumber  = rollNumber;
		d = 0.12;
		numstudent++;
	}
	
}

