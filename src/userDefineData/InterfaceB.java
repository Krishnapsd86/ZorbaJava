package userDefineData;

public class InterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abstract class 

		// can we create object ?? NO 
		// abstract class can have both methods 
		// to abstract class use abstract keyword for class as well as method
		// can abstract class have constructor ?? yes
		// can we inherit abstract class ?
		// interface implements 
		// purpose of interface
		
		Rectangle rr = new Rectangle();
		rr.getArea(12, 25);

	}

}
interface Polygon{
	public void getArea(int lenght,int breadth);
}
class Rectangle implements Polygon{

	@Override
	public void getArea(int lenght, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("Total area of Rectangle: "+(lenght*breadth));
	}
	
}