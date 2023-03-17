package ExceptionHandle;

public class Day1 {
	
	public static void main(String[] args) {
		
		//Syntax
		
		/*try{
		 *    risky code
		 * }
		 * catch(ExceptionClassName referance variable){
		 *       handling code
		 * }
		 * */
		
		//runtime Exception
		int x = 100, y =0,c;
		try {
			c=x/y;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			String name = null;
			System.out.println(name);
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception error ");
		}
		
		System.out.println("Hello");
		System.out.println("There");
		
	}

}
