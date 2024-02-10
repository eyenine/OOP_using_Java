package Abstraction;

public abstract class Shape {

	String color;
	
	//abstract class
	abstract double area();
	public abstract String toString();
	
	//Constructor
	public Shape(String color) {
		System.out.println("Shape contructor called");
		this.color=color;
	}
	
	//Concrete method
	public String getColor() {
		return color;
	}
	
	
}
