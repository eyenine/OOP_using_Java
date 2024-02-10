package Abstraction;

public class Rectangular1 implements Shape1{
	private double length;
	private double width;
	public Rectangular1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length*width;
	}

}
