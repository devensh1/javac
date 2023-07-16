package inheritance2;

public  class Car extends Vehicle{

	String brand;
	
	
	public void print() {
		super.print();
		System.out.println("brand of car is:"+ " " +brand);
	}
	
	public boolean  isMotorized() {
		return false;
	}
	
	
	

}
