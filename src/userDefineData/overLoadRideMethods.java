package userDefineData;

public class overLoadRideMethods {

	public static void main(String[] args) {

		// overload without constructor

		Instrument Ins = new Instrument();
		Ins.collection("Pano", " musical");
		Ins.collection("Guitar", " musical ", 5);
		Ins.collection("Guitar", " musical ", 5, " National");

		// overloading with constructor
		Mother ama = new Mother(); // Default
		ama.displayMother();
		Mother aama = new Mother("Jamuna");// 1st parameter
		aama.displayMother();
		Mother ama1 = new Mother("Muna", "Sharma");// 2nd parameter
		ama1.displayMother();
		Mother aama1 = new Mother("Indra", "Tamang", 58);// 3rd parameter
		aama1.displayMother();
		
		//overriding
		WorldBank Boa = new WorldBank("BOA",1234);
		Boa.Loan(3);
		Boa.Saving(5);
		national chase = new national("Chase",2323,1234);
		chase.Loan(5);
		chase.Saving(7);
		cityBank ae = new cityBank("American Express",2323,6767);
		ae.Loan(7);
		ae.Saving(4);

	}

}
//overloading Methods
//same class 
// same method name 
// different signature 

class Instrument {

	// without constructor

	public void collection(String name, String type) {
		System.out.println(name + type);
	}

	public void collection(String name, String type, int num) {
		System.out.println(name + type + num);
	}

	public void collection(String name, String type, int num, String brand) {
		System.out.println(name + type + num + brand);
	}
}

class Mother {

	// with constructor

	public Mother() {
		System.out.println("Default ");
	}

	public Mother(String firstName) {
		System.out.println("Calling constructor with 1 parameter " + firstName);
	}

	public Mother(String firstName, String lastName) {
		System.out.println("Calling constructor with 2 parameter " + firstName + " " + lastName);
	}

	public Mother(String firstName, String lastName, int age) {
		System.out.println("Calling constructor with 3 parameter " + firstName + " " + lastName + " " + age);
	}

	void displayMother() {
		return;

	}
}
// Overriding Method
//Different class 
//Same method name 
//Same signature via Inheritance

class WorldBank {
	String city;
	int pinCode;

	public WorldBank(String city, int pn) {
		this.city = city;
		this.pinCode = pn;
	}

	void Loan(int x) {
		System.out.println("World Bank loan : " + x);
	}

	void Saving(int y) {
		System.out.println("World Bank Saving : " + y);
	}
}

class national extends WorldBank {
	int code;

	public national(String city, int pn, int code) {
		super(city, pn);
		this.code = code;
	}

	void Loan(int x) {
		System.out.println("National loan : " + x);
	}

	void Saving(int y) {
		System.out.println("National Saving : " + y);
	}
}

class cityBank extends WorldBank {
int bcode;
	public cityBank(String city, int pn,int bcode) {
		super(city, pn);
		this.bcode=bcode;
	}
	void Loan(int x) {
		System.out.println("CityBank loan : " + x);
	}

	void Saving(int y) {
		System.out.println("CityBank Saving : " + y);
	}
}
