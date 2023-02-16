package userDefineData;

public class userDefine {

	public static void main(String[] args) {
		
		//user define data

		Human name = new Human("male ", "chandra ", "giri ", 25);	
		System.out.println(name.gender+name.firstName+name.lastName+name.age);
		name.talk();
		
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
	public vehicle(String m,String c,String t,int yr) {
		this.model=m;
		this.color=c;
		this.type=t;
		this.year=yr;
	}
	public void start() {
		System.out.println("start engine");
	}
	public void stop() {
		System.out.println("stop engine");
	}
}