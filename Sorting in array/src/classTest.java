
public class classTest {
	
	int x ;
	int y;
	
	classTest (int x, int y){
		this.x =x;
		this.y = y;
	}

	public static void main(String[] args) {
		classTest t = new classTest(20 , 30);
		System.out.print(t.x+ " "+ t.y);

	}

}
