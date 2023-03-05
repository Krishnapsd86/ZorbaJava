package userDefineData;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-90.90));
		System.out.println(Math.abs(90));
		
		Family.displayAddress();
		System.out.println(Family.Address);
		// can we call or access static properties and methods on reference variable
	}

}

class Family {
	String fullName;
	int houseNo;
	static String Address = "Nepal";

	Family(String fn, int hn) {
		this.fullName = fn;
		this.houseNo = hn;
	}

	public void displayName() {
		System.out.println(this.fullName);
	}

	// static method
	public static void displayAddress() {
System.out.println(Family.Address);
	}
}
