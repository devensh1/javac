package classandobject;

public class Fraction {
	
	 int numerator;
	 int denominator;
	
	
	public void Simplify() {
		int gcd =1;
		int small = Math.min(numerator , denominator);
		for(int i=2; i<=small; i++){
			if(numerator% i==0 && denominator%i==0){
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	public Fraction(int numerator , int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		Simplify();
		
	}

}
