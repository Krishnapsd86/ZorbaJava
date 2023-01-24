package One;

public class Day4 {

	public static void main(String[] args) {

		// Conditional Statement
		// Example of Ticket
		// numT > 0 && numT <= 5
		// numT > 5 && numT <= 10
		// numT > 10

		int numT = 10;

		if (numT > 0 && numT <= 5) {
			System.out.println("5% Discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("10% Discount");
		}
		if (numT > 10) {
			System.out.println("20% Discount");
		}
		System.out.println("-----------------------------------");

		int x = 10;
		int y = 5;

		if (x > y) {
			System.out.println("Bigger Number is x");
		} else {
			System.out.println("Bigger Number is y");
		}

		System.out.println("-----------------------------------");

		int x1 = 100;
		int y1 = 150;
		int a = 20;
		if (x1 > y1) {
			System.out.println("X1 is greater");
		}

		else if (y1 > a) {
			System.out.println("Y1 is greater");
		} else {
			System.out.println("A is greater");
		}
		System.out.println("------------------------------");
	}

}
