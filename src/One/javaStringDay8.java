package One;

public class javaStringDay8 {

	public static void main(String[] args) {
		
		// String  + Integer  ===>  String
		// Integer + Integer  ===>  Integer
		// Integer + String   ===>  String
		// String  + String   ====> String
		
		String name = new String("Krishna");
		System.out.println(name.toUpperCase());
		
		String subject = "Java ";
		String about = "Programming ";
		String what = " language";
		System.out.println("I am learning "+subject+about+what);
		
		String alphabet ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(alphabet.length());
		
		

	}

}
