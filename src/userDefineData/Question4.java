package userDefineData;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q1 ans = new q1();
		ans.question = "question";
		q1.ans x = ans.new ans();
		x.result();
		x.displayInput();

		Autocar aa = new Autocar("White", "Suv");
		aa.displayCar("White");
		aa.displayCar("White", "Suv");

		suv a = new suv("White", "Bmw", "suv");
		a.displayCar("Suv");

		countable aaa = new countable("Kabin");
		countable aa2 = new countable("Kavin");
		countable aa3 = new countable("Karin");
		aaa.display();
		aa2.display();
		aa3.display();
		System.out.println(countable.count);

		// Write a program to reverse string "Nepal"
		String name1 = "Nepal", rev = "";
		char ch;

		for (int i = name1.length() - 1; i >= 0; i--) {
			ch = name1.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);

	}

}

//Define a class/inner class with method & call the method of inner class from main method
class q1 {
	String question;

	class ans {
		String answer;

		public String result() {
			if (q1.this.question.equals("question")) {
				this.answer = "question";
			} else if (q1.this.question.equals("answer")) {
				this.answer = "answer";
			} else {
				System.out.println("Please provide question or answer");
			}
			return this.answer;
		}

		public void displayInput() {
			System.out.println(this.answer);
		}
	}
}

//write a program for overloading and overriding 
class Autocar {
	String color;
	String model;

	Autocar(String color, String model) {
		this.color = color;
		this.model = model;
	}

	void displayCar(String color) {
		System.out.println(this.color);
	}

	// overLoading
	void displayCar(String color, String model) {
		System.out.println(this.color + " " + this.model);

	}
}

//overRiding
class suv extends Autocar {
	String type;

	suv(String color, String model, String ty) {
		super(color, model);
		// TODO Auto-generated constructor stub
		this.type = ty;
	}

	void displayCar(String type) {
		System.out.println(this.type + " " + this.color + " " + this.type);
	}

}

//write a program to count number of objects
class countable {
	static int count = 0;
	String name;

	countable(String nm) {
		this.name = nm;
		countable.increaseC();
	}

	public void display() {
		System.out.println(this.name);
	}

	public static void increaseC() {
		countable.count = countable.count + 1;
	}

}
