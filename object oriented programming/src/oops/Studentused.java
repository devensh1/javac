package oops;

public class Studentused {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name ="akashna";
		s1.setage(23);
		System.out.println(s1.name+ " "+s1.getage());
		
		s1.print();
		
		Student s2 = new Student();
		s2.name = "kasha";
		s2.setage(34);
		System.out.println(s2.name + " "  + s2.getage());
		
		

	}

}
