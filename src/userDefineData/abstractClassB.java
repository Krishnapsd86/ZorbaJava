package userDefineData;

public class abstractClassB {
	
	//You cannot create object of abstract class
	//abstract class can have method with definition only
	// abstract class can have normal methods
	// Abstract method --- no body only definition

	public static void main(String[] args) {
		
		//abstract without constructor
		Nbank NRB=new Nbank();
		NRB.displayDetails();
		NRB.loan();
		NRB.save();
		NRB.BranchName();
		
		//abstract class with constructor
		Pname roshan = new Pname("Roshan","Teacher",34);
		roshan.displayDetails();

	}

}

abstract class Wbank{
	
	//abstract method
	abstract public void save();
	abstract public void loan();
	
	//normal method
	public void displayDetails() {
		System.out.println("Nepal");
	}
}
class Nbank extends Wbank{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Nbank save");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Nbank loan");
	}
	
	// can add methods of own class
	
	public void BranchName() {
		System.out.println("Nbank");
	}
	
}

abstract class Info{
	//abstract with constructor
	String Name;
	String Detail;
	 Info(String nm,String dtl) {
		this.Name=nm;
		this.Detail=dtl;
	}
	 abstract public void displayDetails();
}
class Pname extends Info{
int age;
	Pname(String nm, String dtl,int ag) {
		super(nm, dtl);
		// TODO Auto-generated constructor stub
		this.age=ag;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.Name+" "+this.Detail+" "+this.age);
	}
	
}













