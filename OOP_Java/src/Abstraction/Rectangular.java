package Abstraction;

public class Rectangular extends Shape {

	double lenght;
	double width;
	public Rectangular(String color,double lenght, double width) {
		super(color);
		this.lenght = lenght;
		this.width = width;
	}
	
	@Override double area() {
		return lenght*width;
	}
	@Override public String toString() {
		return "Rectangular color is: "+super.getColor()+"and the area is :"+area();
	}
	
	
}
