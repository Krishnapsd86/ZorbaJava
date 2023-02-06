package Two;

public class Java3 {

	public static void main(String[] args) {

		String state = "Texas", rev = "";
		char ch;
		for (int i = 0; i < state.length(); i++) {
			ch = state.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);

		for (int i = state.length() - 1; i >= 0; i--) {
			System.out.println(i);
		}
		//Finding the input
		
		String shop ="Pasta,fruits,biscuits,drinks,grocery";
		String items = "Drinks";
		if(shop.contains(items)) {
			System.out.println("Items are available");
		}
		else {
			System.out.println("Items not available");
		}


		// Find vowel
		String firstName = "Krishna";
		int count=0;
		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));

			if (firstName.charAt(i) == 'a' || firstName.charAt(i)== 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
