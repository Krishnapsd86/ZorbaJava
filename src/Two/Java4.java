package Two;

public class Java4 {

	public static void main(String[] args) {

		// substring
		String str = "I am having fun learning java.";
		String r1 = str.substring(0, 9); // End value is not included
		System.out.println(r1);
		String r2 = str.substring(0, 15);
		System.out.println(r2);

		// end index is optional
		String str1 = "Happy learning !!";
		String r3 = str1.substring(3);
		System.out.println(r3);
		String r4 = str1.substring(6);
		System.out.println(r4);

		// join
		String r5 = String.join(" ", str, str1);
		System.out.println(r5);

		String str2 = "I am learning";
		String str3 = "how to write code";
		String str4 = "in java programming";
		String r6 = String.join(" ", str2, str3, str4, str1);
		System.out.println(r6);

		String str5 = "krishnapsd";
		String str6 = "thapaliya";
		String str7 = "gmail.com";
		String str8 = " email send successfully";
		String r7 = String.join(".", str5, str6);
		String r8 = String.join("@", r7, str7);
		System.out.println(r8.concat(str8));

		// Indexof
		int r9 = str5.indexOf('a');
		System.out.println(r9);

		int r10 = str6.indexOf("p", 1);
		System.out.println(r10);

		// Find the spefic char
		String str9 = "I am looking for the special charactor where i want to code with";
		for (int i = 0; i < str9.length(); i++) {
			if (str9.charAt(i) == 'k') {
				System.out.println(i);
			}
		}

		// trim(To remove white space char)
		String str10 = " To Remove white space of charater ";
		String str11 = str10.trim();
		System.out.println(str11.length());
		System.out.println(str10.length());

		// Replace(remove spaces in between)
		String r11 = str10.replace(" ", "");
		System.out.println(r11);

		// split(break the string)
		String[] r12 = str10.split(" ");
		System.out.println(r12);

		// to see Result of split in console
		for (String strs : r12) {
			System.out.println(strs);
		}

		// Isempty(checks whether a String is empty or not)
		String str12 = "I am checking empty function with boolean ";
		String str13 = "";
		boolean r13 = str12.isEmpty();
		System.out.println(r13);
		boolean r14 =str13.isEmpty();
		System.out.println(r14);
		
		if(str12.isEmpty()) {
			System.out.println("String 12 is empty");
		}
		else if(str13.isEmpty()) {
			System.out.println("String 13 is empty");
		}
		else {
			System.out.println("both are not empty");
		}
	}

}
