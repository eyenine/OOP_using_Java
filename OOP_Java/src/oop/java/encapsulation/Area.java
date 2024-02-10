package oop.java.encapsulation;

public class Area {

	private int width;
	private int height;
	public Area(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void getArea() {
		int area=width*height;
		System.out.println(area);
	}
}
