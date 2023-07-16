package inheritance;

public class Personuse {

	public static void main(String[] args) {
		Person s = new Student();
		s.SetString("divya");
		s.age = 32;
		System.out.println(s.getString()+ " " +s.age);
		
		Teacher t = new Teacher();
		t.SetString("avantika");
		t.age = 45;
		t.teach_id = "andheri";
		System.out.println(t.getString()+ " " +t.age+  " " +t.teach_id);
	}

}
