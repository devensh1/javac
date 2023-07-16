package expection;

public class exceiontion {

		public static int divid(int a , int b) throws DivideByZeroException {
			if(b==0){
				throw new  DivideByZeroException();
				//throw new ArithmeticException();
			}
			return a/b;
		}
		
		public static void main(String[] args) {
			
		
			try {
				divid(10 , 0);
			} catch (DivideByZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("main");
	}

}
