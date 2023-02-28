package userDefineData;

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog rocky = new Dog();
		rocky.name = "Rocky";
		rocky.type = " Dog";
		rocky.display();
		
		Cat meow = new Cat();
		meow.name="Meow";
		meow.type=" Cat";
		
		meow.display();

	}

}

abstract class Animal {

	String type;
	String name;

	public void display() {
		System.out.println(this.name + this.type);
	}
}

class Dog extends Animal {
	
	public void display() {
		System.out.println(this.name +this.type+" bhoou bhoou");
				
	}

}
class Cat extends Animal{
	
	public void display() {
		System.out.println(this.name +this.type+" meow meow");
				
	}
}