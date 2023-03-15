package Enum;

enum ModelTy{
	SUV("NISSAN"),//custom value of SUV is NISSAN
	SEDAN("HONDA"),
	MINI("MINI COOPER");
	
	private String display;
	private ModelTy(String v) {
		this.display=v;
	}
	public String displayTy() {
		return this.display;
	}
}

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelTy mm= ModelTy.SEDAN;
		System.out.println(mm);
		System.out.println(mm.displayTy());
		ModelTy mm1= ModelTy.SUV;
		System.out.println(mm1.displayTy());
		
		

	}

}
