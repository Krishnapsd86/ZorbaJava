package One;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;
		int y = 10;
		int z = 15;

		int worker = 10;

		Fun(10, 20);

		if (x == y && y > x) {
			System.out.println("X is greater");
		} else if (y == z || z < y) {
			System.out.println("Y is greater");
		} else {
			System.out.println("Z is greatest");
		}
		System.out.println(!(x == y));

		switch (worker) {
		case 40:
			System.out.println("Full Time employer");
			break;
		case 30:
			System.out.println("Part Time employer");
			break;
		case 15:
			System.out.println("Flexible employer");
			break;
		default:
			System.out.println("Please input correct hours");
		}
	}

	static void Fun(int x, int z) {
		System.out.println(x + z);
		System.out.println(x - z);
		System.out.println(x * z);
		System.out.println(x / z);
		System.out.println(x % z);

	}

}
