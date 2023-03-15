package Enum;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to create sets of constants for use with variables and properties.
		// fixed set of constants values
		
		System.out.println(Size.LARGE);
		
		Auto1 aa = new Auto1(CarTy.MINI);
		aa.displayType();
		aa.getCarType();

	}

}
enum Size{
	SMALL,
	MEDIUM,
	LARGE
}
enum CarTy{
	SUV,
	SEDAN,
	MINI
}
class Auto1{
	CarTy type;
	Auto1(CarTy y){
		this.type=y;
		
	}
	public String displayType() {
		switch(type) {
		case SUV:
			System.out.println("NISSAN");
			return "NISSAN";
		case SEDAN:
			System.out.println("HONDA");
			return "HONDA";
		case MINI:
			System.out.println("MINI COOPER");
			return "MINI COOPER";	
		}
		return "DEFAULT";
		
	}
	public void getCarType() {
	switch (type) {
	case SEDAN:
		System.out.println("Audi Q6");
		break;
	case SUV:
		System.out.println("BMW");
		break;

	case MINI:
		System.out.println("Mini Cooper");
		break;
	default:
		System.out.println("Have you own type");
	}
	
}
}
