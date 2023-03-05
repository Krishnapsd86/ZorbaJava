package userDefineData;

public class InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetailName arpan = new DetailName( 12, 'A');
		arpan.books();
		arpan.name();
		arpan.Grade='A';
		arpan.total();
		arpan.type();
		
	}

}

interface School {
	public void name();

	public void total();

}

interface Library1 {
	public void books();

	public void type();
}

class Student1 {
	int rollNo;
	char Grade;

	public Student1(int rn, char gr) {
		this.rollNo = rn;
		this.Grade = gr;

	}

	void displayS() {
		System.out.println("");
	}
}

class DetailName extends Student1 implements School, Library1 {
	

	public DetailName( int rn, char gr) {
		super(rn, gr);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void books() {
		// TODO Auto-generated method stub
		System.out.println("Books");

	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("Type");
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		System.out.println("Total");

	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Name ");
		
	}

}
