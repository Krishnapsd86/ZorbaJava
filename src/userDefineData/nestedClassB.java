package userDefineData;

public class nestedClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car audi = new Car("Audi","Suv");
		Car.Auto au = audi.new Auto();
		au.typeBase();
		au.displayEngine();
		au.displayEngine();
		Car bmw = new Car("BMW","Sedan");
		Car.Auto b =bmw.new Auto();
		b.typeBase();
		b.displayEngine();
		

	}

}

class Car {
	String name;
	String type;

	Car(String nm, String type) {
		this.name = nm;
		this.type = type;
	}

	private String getCar() {
		return this.name;
	}

	class Auto {
		String engine;

		public String typeBase() {
			if (Car.this.type.equals("Suv")) {
				this.engine="Bigger";
			} else if (Car.this.type.equals("Sedan")) {
				this.engine="Smaller";
			} else {
				this.engine="Default";
			}
			return this.engine;
		}

		void displayEngine() {
			System.out.println(this.engine);
		}
	}

}
