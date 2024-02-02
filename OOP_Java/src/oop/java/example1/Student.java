package oop.java.example1;

public class Student {
	
	int id;
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		std1.setId(5);
		std1.setName("Eyenine");
		
		
		
		System.out.println(std1.getId());
		System.out.println(std1.getName());
		
		std1 = new Student();
		System.out.println(std1.getId());
		System.out.println(std1.getName());
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
