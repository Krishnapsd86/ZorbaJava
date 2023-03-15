package userDefineData;

enum CarType1{
	// enums constants calling woth constructor
	
	SUV("NISSAN"),//custom value of SUV is NISSAN
	SEDAN("HONDA"),
	MINI("MINI COPPER");
	
	private final String carType;
	//constructor
	private CarType1(String s) {
		this.carType=s;
	}
	public String displayCarType() {
		return this.carType;
	}
	
	
}
enum Tshirt{
	SMALL("Child"),
	MEDIUM("Teenage"),
	LARGE("Man");
	private  String Tshirt1;
	private Tshirt(String x) {
		this.Tshirt1=x;
	}
	public String displayTshirt() {
		return this.Tshirt1;
	}
	
	}

public class EnumConstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarType1 ff=CarType1.SEDAN;
		System.out.println(ff.displayCarType());
		
		Tshirt tt = Tshirt.LARGE;
		System.out.println(tt.displayTshirt());

	}

}
