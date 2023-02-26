package userDefineData;

public class inheritanceType {

	public static void main(String[] args) {
		
		// creating object of Single  Inheritance
		Student achal = new Student("Achal Sharma","Pokhara",28);
		achal.displayFullName();
		Teacher shyam = new Teacher("Shyam Roa","Pokhara",35,10000);
		shyam.displayBonus();
		
		// creating object of MultiLevel  Inheritance
		Library national=new Library("National Library"," Dallas",2010);
		national.displayLibrary();
		BranchA nationalA = new BranchA("National Library"," Fort Worth",2010," branch-1");
		nationalA.displayBa();
		BranchB nationalB = new BranchB("National Library"," Irving",2010," branch-2 ","5% discount");
		nationalB.displayBB();
		

	}

}
      //Single  Inheritance
class Student{
	String fullName;
	String city;
	int age;
	public Student(String fn,String city,int age) {
		this.fullName =fn;
		this.city = city;
		this.age = age;
	}
	void displayFullName() {
		System.out.println(this.fullName);
	}
}
class Teacher extends Student{
int salary;
	public Teacher(String fn, String city, int age,int salary) {
		super(fn, city, age);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	void displayBonus() {
		this.displayFullName();
		System.out.println(salary + 200);
	}
	
}
//Multilevel inheritence
class Library {
	String name;
	String location;
	int years;
	public Library(String name,String loc,int yrs) {
		this.name = name;
		this.location = loc;
		this.years = yrs;
	}
	void displayLibrary() {
		System.out.println(this.name + this.location);
	}	
}
class BranchA extends Library{
String type;
	public BranchA(String name, String loc, int yrs,String type) {
		super(name, loc, yrs);
		// TODO Auto-generated constructor stub
		this.type =type;
	}
	void displayBa() {
		System.out.println(this.name + this.location + this.type);
	}
}
class BranchB extends BranchA{
String sOffer;
	public BranchB(String name, String loc, int yrs, String type,String offer) {
		super(name, loc, yrs, type);
		// TODO Auto-generated constructor stub
		this.sOffer = offer;
	}
	void displayBB() {
		System.out.println(this.name + this.location + this.type + this.sOffer);
	}
	
}




