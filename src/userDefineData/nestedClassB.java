package userDefineData;

public class nestedClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 audi = new Car1("Audi","Suv");
		Car1.Auto au = audi.new Auto();
		au.typeBase();
		au.displayEngine();
		au.displayEngine();
		Car1 bmw = new Car1("BMW","Sedan");
		Car1.Auto b =bmw.new Auto();
		b.typeBase();
		b.displayEngine();
		

	}

}

class Car1 {
	String name;
	String type;

	Car1(String nm, String type) {
		this.name = nm;
		this.type = type;
	}



	class Auto {
		String engine;

		public String typeBase() {
			if (Car1.this.type.equals("Suv")) {
				this.engine="Bigger";
			} else if (Car1.this.type.equals("Sedan")) {
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
