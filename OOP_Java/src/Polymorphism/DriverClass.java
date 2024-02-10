package Polymorphism;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Helper.Multiply(10, 20));
//		System.out.println(Helper.Multiply(5.5, 6.5,7.5));
		
		Parent a;

		a=new SubClass1();
		a.print();
		
		a=new SubClass2();
		a.print();

	}

}
