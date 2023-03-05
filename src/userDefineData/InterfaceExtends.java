package userDefineData;

public class InterfaceExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa5 aba = new Aa5("A",1);
		aba.displayAlpha();
		aba.a1();
		aba.aa();
		aba.aaa();
		aba.abbb();

	}

}
interface Aa{
	public void a1();
	public void a2();
}
interface Aa2{
	public void aa();
	public void ab();
}
interface Aa3{
	public void aaa();
	public void abb();
}
abstract class Aa4{
	String Alpha;
	Aa4(String Alpha){
		this.Alpha=Alpha;
	}
	abstract public void abbb();
	void displayAlpha() {
		System.out.println(this.Alpha);
	}
}
class Aa5 extends Aa4 implements Aa,Aa2,Aa3{
int num;
	Aa5(String Alpha,int num) {
		super(Alpha);
		// TODO Auto-generated constructor stub
		this.num=num;
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("Aa3 aaa");
		
	}

	@Override
	public void abb() {
		// TODO Auto-generated method stub
		System.out.println("Aa3 abb");
	}

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		System.out.println("Aa2 aa");
	}

	@Override
	public void ab() {
		// TODO Auto-generated method stub
		System.out.println("Aa2 ab");
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		System.out.println("Aa a1");
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
		System.out.println("Aa a2");
	}

	@Override
	public void abbb() {
		// TODO Auto-generated method stub
		System.out.println("Aa4 abstract abbb");
	}
	
}
