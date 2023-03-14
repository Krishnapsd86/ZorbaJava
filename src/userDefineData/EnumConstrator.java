package userDefineData;

enum CarType1{
	// enums constants calling woth constructor
	SUV("NISSAN"),
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

public class EnumConstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarType1 ff=CarType1.SEDAN;
		System.out.println(ff.displayCarType());

	}

}
