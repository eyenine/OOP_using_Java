package Abstraction;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Shape s1 = new Circle("Red",5);
//		Shape s2 = new Rectangular("Black",5,10);
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
		
//		Animal myDog = new DOg("Jimmy");
//		Animal myCat = new Cat("Pussy");
//		
//		myDog.makeSound();
//		myCat.makeSound();
		
		Shape1 s1 = new Circle1(20);
		Shape1 s2 = new Rectangular1(10, 10);
		
		System.out.println(s1.calculateArea());
		System.out.println(s2.calculateArea());
		
		
	}

}
