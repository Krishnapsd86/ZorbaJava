package userDefineData;

public class nestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested Class
		// class inside the class

		Grocery gr = new Grocery();
		gr.price = 10;
		System.out.println(gr.price);
		gr.displayGrocery();

		Grocery.Fruits fr = gr.new Fruits();
		fr.detailsOfFruits("Orange", "Fruit");

		Grocery.Vegetables vg = gr.new Vegetables();
		vg.detailsOfVegan("Potato", "Vegetable");

	}

}

class Grocery {
	int price;

	class Fruits {
		String name;
		String type;

		public void detailsOfFruits(String name, String type) {
			this.name = name;
			this.type = type;
			System.out.println("List of Fruits" + " " + name + " " + type);
		}
	}

	class Vegetables {
		String vName;
		String vType;

		public void detailsOfVegan(String vName, String vType) {
			this.vName = vName;
			this.vType = vType;
			System.out.println("list of Vegetables" + " " + vName + " " + vType);
		}
	}

	public void displayGrocery() {
		System.out.println(this.price);
	}
}
