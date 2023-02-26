package userDefineData;

public class Inheritance {

	public static void main(String[] args) {

		GrandFather hari = new GrandFather("Hari", "Dhakal");
		System.out.println(hari.firstName + " " + hari.lastName);
		hari.displayFullName();

		// inheritance properties\methods from GrandFather class
         father ram = new father("Hari","Dhakal","Ram");
         System.out.println(ram.firstName + " " + ram.lastName +" "+ ram.ffirstName);
         ram.displayfFullName();
         
      // inheritance properties\methods from Father class
         son ramhari = new son("Hari","Dhakal","Ram","RamHari");
         System.out.println(ramhari.firstName+" "+ramhari.lastName+" "+ramhari.ffirstName+" "+ramhari.sFirstName);
         ramhari.displaysFullName();
	}

}

class GrandFather {
	String firstName;
	String lastName;

	public GrandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void displayFullName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class father extends GrandFather {
	String ffirstName;

	public father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.ffirstName = ffn;

	}

	public void displayfFullName() {
		System.out.println(this.firstName + this.lastName);
	}
}
class son extends father{
String sFirstName;
	public son(String fn, String ln, String ffn,String sfn) {
		super(fn, ln, ffn);
		this.sFirstName=sfn;
	}
	public void displaysFullName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}