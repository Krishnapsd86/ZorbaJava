package userDefineData;

//fixed set of const values

enum Size{ SMALL,MEDIUM,LARGE,XL,XXL }


enum CarType{ SUV,SEDAN,MINI }

public class EnumPra {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Size.LARGE);
		TestCar tt=new TestCar(CarType.SEDAN);
		tt.getCarType();

	}

}
class TestCar{
	
	CarType Tcar;
	
	public TestCar(CarType s) {
		this.Tcar=s;
		
	}
	public void getCarType() {
		switch(Tcar) {
		case SUV:
			System.out.println("NISSAN");
			break;
		case SEDAN:
			System.out.println("NISSAN");
			break;
		case MINI:
			System.out.println("NISSAN");
			
		}
	}
}
