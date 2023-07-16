package oops;

public class Studentc {
	
	int age;
	String name;
	//static keyword is created on class its shard for all object //
	static  int numstudent;
	
	
	private int rollnumber;
	//one constructor create for only oe object//
	public Studentc (String name, int rollnumber) {
		this.name = name;
		this.rollnumber = rollnumber;
		numstudent++;
		
	}
	
	//conster we can stored objet values also 
	//user have freely acceses to give whatever he want argumnet //
	//one object for only one conster is availabel//
	public Studentc(String name) {
		System.out.println("name of" + name);
	}
	
	public void print() {
		System.out.println(name+ " "+rollnumber);
	}
	

}
