package Abstraction;

public class Circle1 implements Shape1 {
	
	private double radius;

	public Circle1(double radius) {
		super();
		this.radius = radius;
	}
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

}
