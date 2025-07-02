package practice;

public class Animal {
	
	private String sound;
	
	public Animal() {
		sound = "Generic sound";
	}
	
	public Animal(String newSound) {
		sound = newSound;
	}
	
	public void makeSound() {
		System.out.println(sound);
	}
	
	public void eat() {
		System.out.println("Animal eats");
	}

}

class Cat extends Animal {
	public Cat() {
		super();
		super.eat();
	}
	
	public Cat(String newSound) {
		
	}
	
	public void doSomething() {
		super.eat();
	}
	
	public void eat(String animal) {
		System.out.println("The cat is eating " + animal);
	}
	
	public String toString() {
		return "animal";
	}
}
