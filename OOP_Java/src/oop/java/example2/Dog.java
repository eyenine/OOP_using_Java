package oop.java.example2;

public class Dog {
	
		String name;
		String color;
		String breed;
		int age;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
	public Dog(String name,String color,String breed,int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}
		
		public void printDogDetails() {
			 System.out.println("The dog name is "+this.name+" and the color is "+this.color+" and the breed is "+this.breed+" and the age is "+this.age);
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Tommy","Red","Bulldog",3);
		dog1.printDogDetails();
		

	}


}