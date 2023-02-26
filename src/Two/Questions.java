package Two;

import java.util.Arrays;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [][][] a = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				}
		};
		for(int[][]b:a) {
			for(int []c:b) {
				for(int d:c) {
					System.out.println(d);
				}
			}
		}
		
		
		
		String name="Chinmay",rev="";
		char ch;
		for(int i = name.length()-1;i>=0;i--) {
			ch =name.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		
		String name1 = name.replace("a", "i");
		System.out.println(name1);
		
		Vehicle bmw = new Vehicle("Suv","white");
		bmw.start();
		Vehicle nissan = new Vehicle("sedan","blue");
		nissan.stop();
		Vehicle toyota = new Vehicle("Suv","red");
		toyota.start();
		Vehicle []car = {
				new Vehicle("Suv","white"),
				new Vehicle("sedan","blue"),
				new Vehicle("Suv","red")
		};
		System.out.println(Arrays.toString(car));
		for(Vehicle a1:car) {
			System.out.println(a1.type);
		}
		
		
	}

}
class Vehicle{
	String type;
	private String color;
	public Vehicle(String type,String color) {
		this.type=type;
		this.color=color;
	}
	void displayVechicle(){
		System.out.println(this.type + this.color);
	}
	
	void start() {
		System.out.println(this.color+ " Start engine");
	}
	void stop() {
		System.out.println(this.color+" Stop engine");
	}
}