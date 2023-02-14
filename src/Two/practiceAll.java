package Two;

public class practiceAll {

	public static void main(String[] args) {
		// reverse
		String name = "Birtamode", rev = "";
		char ch;

		for (int i = name.length() - 1; i >= 0; i--) {
			ch = name.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);

		String example = "Butwal";
		int a = example.length();
		System.out.println(a);

		for (int i = 0; i < 6; i++) {
			System.out.println(example.charAt(i));
		}

		for (int i = example.length() - 1; i >= 0; i--) {
			System.out.println(example.charAt(i));
		}
		// even || odd

		int num = 17;
		if (num % 2 == 0) {
			System.out.println("You enter even number");
		} else {
			System.out.println("You enter odd number");
		}

		// Prime or Not
		int i;
		int m = 0;
		int prime = 0;
		int input = 21;
		m = input / 2;
		if (input == 0 || input == 1) {
			System.out.println("not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (input % i == 0) {
					System.out.println("not a prime number");
					prime = 1;
					break;
				}
			}
			if (prime == 0) {
				System.out.println("prime number");
			}
		}

		int p;
		int n = 0;
		int pn = 0;
		int pr = 17;
		n = pr / 2;
		if (pr == 0 || pr == 1) {
			System.out.println("not prime");
		} else {
			for (p = 2; p <= n; p++) {
				if (pr % p == 0) {
					System.out.println("not prime");
					pn = 1;
					break;
				}
			}
			if (pn == 0) {
				System.out.println("prime number");
			}
		}
		
		
		String str = "Best says ";
		String st = "'All is well'";
		String r = str.concat(st);
		System.out.println(r.toUpperCase());
		System.out.println(r.toLowerCase());
		
		String s1="apple";
		String s2="mango";
		String s3 = "apple";
		boolean result =s1.equals(s2);
		boolean result1 = s1.contains(s3);
		System.out.println(result);
		if(result1) {
			System.out.println("Both name are match");
		}else {
			System.out.println("Does not match");
		}
 
		String result2=s1.equals(s3)?"match":"doesnot match";
		System.out.println(result2);
		
		String eChar ="Best line \"Learning is best part of life\"";
		System.out.println(eChar);
		
		String string ="Damak";
		boolean s = string.startsWith("d");//case sentitive
		boolean st1 =string.endsWith("k");
		System.out.println(s);
		System.out.println(st1);
		
		String sent="I am a good typer and a writer";
		boolean d =sent.contains("am");
		System.out.println(d);
		
		String rep =sent.replace("typer", "coder");
		System.out.println(rep);
		
		String fruits ="apple,mango,orange,pineapple,banana";
		String av = "banana";
		if(fruits.contains(av)) {
			System.out.println("available");
		}else {
			System.out.println("not available");
		}
		
		String city ="makunpur";
		int count = 0;
		for(int c=0;c<city.length();c++) {
			System.out.println(city.charAt(c));
			if(city.charAt(c)=='a'||city.charAt(c)=='e'||city.charAt(c)=='i'||city.charAt(c)=='o'||city.charAt(c)=='u') {
				count = count + 1;
			}
			System.out.println(count);
		}
		
		String sentence=" I am coding on substring with java ";
		String sen = sentence.substring(0,9);
		System.out.println(sen);
		
		for(int b =0;b<sentence.length();b++) {
			if(sentence.charAt(b)=='s') {
				System.out.println(b);
			}
		}
		
		String trim = sentence.trim();
		System.out.println(trim.length());
		System.out.println(sentence.length());
		
		String rep1 = sentence.replace(" ", "-");
		System.out.println(rep1);
		
		String[]spl=sentence.split(" ");
		//System.out.println(spl);
		for(String sp:spl) {
			System.out.println(sp);
		}
		
		String msg ="";
		boolean em = sentence.isEmpty();
		boolean em1 = msg.isEmpty();
		if(sentence.isEmpty()) {
			System.out.println("Try to find the empty one");
		}else if (msg.isEmpty()) {
			System.out.println("Here you go you find me empty");
		}else {
			System.out.println("Please try again");
		}
		
		
		
	}

}
