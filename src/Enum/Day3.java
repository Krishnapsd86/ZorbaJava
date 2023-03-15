package Enum;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color rr =Color.ORANGE;
		System.out.println(rr);
		
		works ll= new works(Days.SAT);
		ll.listOfWork();
		ll.displayCourse(Days.MON);
		
		Days []dd =Days.values();
		for(Days aa:dd) {
			System.out.println(aa);//list
			System.out.println(aa.ordinal());//index
		}
		

	}

}
enum Color{
	RED,
	ORANGE,
	GREEN
	
//	public static final Color RED = new Color();
//  public static final Color GREEN = new Color();
//  public static final Color BLUE = new Color();
}
enum Days{SUN,MON,TUE,WED,THR,FRI,SAT}
class works{
	Days day;
	works(Days d){
		this.day=d;		
	}
	public void listOfWork() {
		switch(day) {
		case SUN:
			System.out.println("Family Time");
			break;
		case MON:
			System.out.println("School Time");
			break;	
		case TUE:
			System.out.println("Excel Sheet");
			break;
		case WED:
			System.out.println("Java Time");
			break;
		case THR:
			System.out.println("JS Time");
			break;	
		case FRI:
			System.out.println("SQL Time");
			break;
		case SAT:
			System.out.println("CSS Time");
			break;	

		}
	}
	public void displayCourse(Days a) {
		if(Days.SUN==a) {
			System.out.println("Selenium");
		}else if(Days.MON==a) {
			System.out.println("Java");
		}else if(Days.TUE==a) {
			System.out.println("JavaScript");
		}else if(Days.WED==a) {
			System.out.println("Python");
		}else if(Days.THR==a) {
			System.out.println("CSS");
		}else if(Days.FRI==a) {
			System.out.println("C#");
		}else if(Days.SAT==a) {
			System.out.println("SQL");
		}
	}
	
}
