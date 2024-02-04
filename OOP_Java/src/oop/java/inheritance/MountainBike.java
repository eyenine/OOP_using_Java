package oop.java.inheritance;

public class MountainBike extends Bicycle{

	int seatHeight;
	
	public MountainBike(int gear,int speed,int startHeight) {
		
		super(gear,speed);
		seatHeight = startHeight;
		
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	@Override 
	public String toString() {
		
		return (super.toString()+" the seatHeight is: "+seatHeight);
	}
	
}
