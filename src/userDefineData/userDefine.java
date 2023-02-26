package userDefineData;

public class userDefine {

	public static void main(String[] args) {
		
		//user define data

		Human chandra = new Human("female ", "chandra ", "giri ", 25);	
		Human hari = new Human("male","hari","lama",32);
		Human ram = new Human("male","ram","tamang",32);
		Human ayush = new Human("male","ayush","lamsal",32);
		
		//storing object to Array
		Human []name = {chandra,hari,ram,ayush};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i].firstName);
			System.out.println(name[i].lastName);
			System.out.println(name[i].gender);
			System.out.println(name[i].age);
			name[i].talk();
			
		}
		for(Human a:name) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			System.out.println(a.gender);
			System.out.println(a.age);
			a.walk();
		}
		
		
		vehicle detail = new vehicle("BMW ","White ","Suv ",2023);
		System.out.println(detail.model+detail.color+detail.type+detail.year);
		detail.start();
	}

}

class Human {
	String gender;
	String firstName;
	String lastName;
	int age;

	public Human(String gn, String fn, String ln, int age) {
		this.gender = gn;
		this.firstName = fn;
		this.lastName = ln;
		this.age = age;
	}

	public void talk() {
		System.out.println("can talk");
	}

	public void walk() {
		System.out.println("can walk");
	}

}
class vehicle{
	String model;
	String color;
	String type;
	int year;
	public vehicle(String model,String color,String type,int yr) {
		this.model=model;
		this.color=color;
		this.type=type;
		this.year=yr;
	}
	public void start() {
		System.out.println("start engine");
	}
	public void stop() {
		System.out.println("stop engine");
	}
}