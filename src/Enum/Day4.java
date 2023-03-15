package Enum;

public class Day4 {
	public static void main(String[]args) {
		/*if you define 5 enum and called 1 enum constructor all 5 enum constrctor will be called
		but what you have define it will be the output in console*/
		
		collection bl=collection.BLACK;
		bl.displayCollection();
		System.out.println(bl);
		
		Traffic le=Traffic.GREEN;
		System.out.println(le.displayMsgs());
		
		Traffic []le1=Traffic.values();
		for(Traffic ru:le1) {
			System.out.println(ru);
			System.out.println(ru.displayMsgs());
		}
		
		
		
	}
}
enum collection{RED,YELLOW,ORANGE,BLUE,BLACK,GREEN;
	
	private collection() {
		System.out.println("Constructor is called");
	}
	public void displayCollection() {
		System.out.println("Method is called");
	}

}
enum Traffic{
	RED("STOP"),
	YELLOW("YEILD"),
	GREEN("GO");
	
	private String msgs;
	private Traffic(String m){
		this.msgs=m;
	}
	public String displayMsgs() {
		return this.msgs;
	}
	
	
	
}