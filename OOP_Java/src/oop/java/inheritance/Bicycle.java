package oop.java.inheritance;

public class Bicycle {

	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	public String toString() {
		return ("Gear is : "+gear+" Speed is : "+speed);
		
	}
	
}
