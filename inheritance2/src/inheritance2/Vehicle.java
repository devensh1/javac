package inheritance2;

public abstract  class Vehicle {
	
	int milege;
	private int maxSpeed;
	
	
	public int getmaxspeed() {
		return maxSpeed;
	}
	
	public void setmaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public abstract  boolean isMotorized();
	
	public void print() {
		System.out.println("milege is "+  " " +milege+  " " +"maxspeed of vehicle is:" + " "+getmaxspeed());
	}


}
