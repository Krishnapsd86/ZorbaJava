package userDefineData;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ajit = new Person();
		ajit.name="Ajit";
		ajit.type="Male";
		ajit.age=24;
		ajit.displayName();
		ajit.name();
		ajit.type();
		ajit.age();
	}

}

interface human1 {
	public void type();
	public void name();
	public void displayName();
}

interface details {
	public void age();
}

class Person implements human1, details {
int age;
String type;
String name;

	@Override
	public void age() {
		// TODO Auto-generated method stub
		
		System.out.println("age "+age);
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("type " + type);
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name " + name);
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Full name : "+name+" "+type);
	}

}