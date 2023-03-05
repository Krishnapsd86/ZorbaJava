package userDefineData;

public class ClassQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam ex = new Exam("English","Major");
		ex.Aone();
		ex.displayQ();
		ex.display();
		ex.displayExam();
		
	}

}
interface Question{
	abstract public void Aone();
	
	default void displayQ() {
		System.out.println();
	}
	
}
interface Rule{
	abstract public void Rone();
	
	default void display() {
		System.out.println();
	}
	
}
abstract class Term{
	abstract public  void term1();
	void displayTerm() {
		
	}
}
class Exam extends Term implements Rule,Question{
String qa;
String sub;
Exam (String qa,String sub){
	this.qa=qa;
	this.sub=sub;
}
	@Override
	public void Aone() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void Rone() {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}

	@Override
	public void term1() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
	void displayExam() {
		System.out.println("Exam "+this.qa+" "+this.sub);
	}
	
	
}