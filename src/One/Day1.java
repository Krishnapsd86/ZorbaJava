package One;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Calculator(12, 6);
		System.out.println("-----");
		
		Calculator(18, 6);
		System.out.println("-----");
		Calculator(24, 4);

	}

	static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

}
