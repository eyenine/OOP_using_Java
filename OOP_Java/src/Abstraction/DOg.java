package Abstraction;

public class DOg extends Animal{

	public  DOg(String name) {
		super(name);
	}
	@Override public void makeSound() {
		System.out.println(getName()+"barks");
	}
}
