package Two;

public class Java1 {

	public static void main(String[] args) {

		// creating a String
		String who = "I am ";
		String what = "learning java ";
		String where = "at Zorba";
		System.out.println(who);
		System.out.println(what);
		System.out.println(where);
		// concat +
		System.out.println(who + what + where);

		// String + Integer ---> String
		// Integer + Integer ---> Integer
		// Integer + String ---> String
		// String + String ---> String

		System.out.println("3" + 2);
		System.out.println(7 + 2);
		System.out.println(3 + "5");
		System.out.println("3" + "7");

		// Length() of string
		String greet = "Namaste welcome to java programming class";
		System.out.println(greet.length());

		String action = "I am writing the epics of book";
		int a1 = action.length();
		System.out.println(a1);

		// Concatenate
		
		String job = "Qa automation ";
		String company = "Zorba ";
		String description = job.concat(company).concat("job opening");
		System.out.println(description);
		// or
		System.out.println(job + company);
		
		String city = new String("Pokhara");
		System.out.println(city);
		
		//upper/Lower case
		
		String lower = city.toLowerCase();
		System.out.println(lower);
		
		String upper = city.toUpperCase();
		System.out.println(upper);
		
		
	}

}
