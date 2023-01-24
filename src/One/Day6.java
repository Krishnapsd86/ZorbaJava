package One;

public class Day6 {

	public static void main(String[] args) {

		// Loop for while

		// for(initialization; condition check; increment/decrement)

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------");

		for (int i = 5; i >= 2; i--) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
			System.out.println("-----------");
		}

		for (int i = 5; i >= 2; i--) {
			System.out.println(i);
			if (i == 4) {
				break;
			}
		}
		System.out.println("-----------");

		for (int i = 2; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}

		for (int i = 5; i <= 8; i++) {
			System.out.println(i);
		}
		// intilization While (condition){statements}increment/decrement

		int i1 = 1;
		while (i1 <= 5) {
			System.out.println("Hello");
			i1++;
		}
		int i2 = 5;
		int i3 = 1;
		while (i2 <= 50) {
			System.out.println("5 x " + i3 + " = " + i2);
			i2 = i2 + 5;
			i3++;
		}
		System.out.println("==================");
		int i5 = 1;
		int i4 = 6;
		while (i4 <= 60) {
			System.out.println("6 x " + i5 + " = " + i4);
			i4 = i4 + 6;
			i5++;
		}
		System.out.println("==================");
		int i6 = 4;
		while (i6 <= 40) {
			System.out.println(i6);
			if (i6 == 24) {
				break;
			}
			i6 = i6 + 4;
		}
		System.out.println("==================");

		int i7 = 11;
		while (i7 <= 110) {
			if (i7 == 77) {
				i7 = i7 + 11;
				continue;
			}
			System.out.println(i7);
			i7 = i7 + 11;
		}
	
	}

}
