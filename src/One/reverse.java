package One;

public class reverse {

	public static void main(String[] args) {

		// reverse the string

		String city = "Kathmandu";
		int len = city.length();
		System.out.println(len);

		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(city.charAt(i));
		}
		System.out.println("---------------------------");

		String alpha = "Massachusetts";
		int total = alpha.length();
		System.out.println(total);

		// Original
		for (int i = 0; i < 13; i++) {
			System.out.println(alpha.charAt(i));
		}
		System.out.println("---------------------------");

		// reverse
		for (int i = alpha.length() - 1; i >= 0; i--) {
			System.out.println(alpha.charAt(i));

		}

		System.out.println("---------------------------");

		String country = "Nepal", reverse = "";
		char ch;

		System.out.print("Orginal :");
		System.out.println("Nepal");

		for (int i = 0; i < country.length(); i++) {
			ch = country.charAt(i);// extracts each character
			reverse = ch + reverse;// adds each character in front of the existing string
		}
		System.out.println("Reversed : " + reverse);
		System.out.println("=======================================");
		
		// Practices

		// check the given number is even or odd
		int givenNum = 11;
		if (givenNum % 2 == 0) {
			System.out.println("Input number is even");
		} else {
			System.out.println("Input number is odd");
		}
System.out.println("=======================================");
		// check the number is prime
		int i;
		int m = 0;
		int pNum = 0;
		int input = 7;
		m = input / 2;
		if (input == 0 || input == 1) {
			System.out.println(input + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (input % i == 0) {
					System.out.println(input + " is not prime number");
					pNum = 1;
					break;
				}
			}
			if (pNum == 0) {
				System.out.println(input + " is prime number");
			}
		}
		System.out.println("=======================================");
		// calculate the factorial of given number

		int f = 1;
		int number = 7;
		for (i = 1; i <= number; i++) {
			f = f * i;
		}
		System.out.println("Factorial of " + number + " is " + f);

	}

}
