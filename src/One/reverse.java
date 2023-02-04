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

	}

}
