package userDefineData;

public class QuestionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student asha = new student("Higher school", 75008, "Asha");
		asha.displayName();
		asha.displayZone();
	}

}

abstract class School1 {
	String name;
	int Zoneno;

	public School1(String nm, int zn) {
		this.name = nm;
		this.Zoneno = zn;
	}

	abstract void displayZone();

	void displayName() {
		System.out.println(this.name + " " + this.Zoneno);
	}
}

class student extends School1 {
	String studentName;

	public student(String nm, int zn, String sName) {
		super(nm, zn);
		// TODO Auto-generated constructor stub
		this.studentName = sName;
	}

	@Override
	void displayZone() {
		// TODO Auto-generated method stub
		System.out.println(this.Zoneno);
	}

}
