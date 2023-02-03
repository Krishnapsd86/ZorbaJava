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
		String alpha ="Massachusetts";
		int total = alpha.length();
		System.out.println(total);

		// regular
		for (int i = 0; i < 13; i++) {
			System.out.println(alpha.charAt(i));
		}
System.out.println("---------------------------");
		// reverse

		for (int i = alpha.length() - 1; i >= 0; i--) {
			System.out.println(alpha.charAt(i));

		}

	}

}
