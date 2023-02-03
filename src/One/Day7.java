package One;

public class Day7 {

	public static void main(String[] args) {

		vehicle BMW = new vehicle("BMW", "SUV", "navi blue", 2023);
		vehicle Porsche = new vehicle("Porsche", "SUV", "Red", 2023);
		System.out.println(BMW.make);
		System.out.println(BMW.model);
		System.out.println(BMW.color);
		System.out.println(BMW.year);
		
		BMW.horn();
		BMW.start();
		BMW.stop();
		
		System.out.println("My Best car is " + Porsche.make +" " + Porsche.model +" "+ Porsche.color + " "+ Porsche.year);
		Porsche.horn();
		Porsche.start();
		Porsche.stop();

	}

}

class vehicle {
	String make;
	String model;
	String color;
	int year;

	public vehicle(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;

	}

	public void start() {
		System.out.println("Bhroom Bhroom");
	}

	public void horn() {
		System.out.println("beeeeeeep beeeeep");
	}

	public void stop() {
		System.out.println("Stop");
	}

}
