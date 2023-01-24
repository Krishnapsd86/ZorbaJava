package One;

public class Day2 {

	public static void main(String[] args) {

		// calling fun without parameter without return type
		fun1();
		fun1();
		System.out.println("----------------------------");

		// calling fun with parameter without return type
		fun2(100, 25);
		fun2(25, 10);
		System.out.println("----------------------------");

		// calling fun with parameter with return type
		int a2 = Add(15, 5);
		System.out.println(a2);

		int s1 = Sub(75, 5);
		System.out.println(s1);

		int d1 = Div(25, 5);
		System.out.println(d1);

	}

	// function without parameter and without return [its hard coded]
	static void fun1() {
		System.out.println(5 + 15);
	}

	// function with parameter and without return type
	static void fun2(int x, int y) {
		System.out.println(x + y);
	}

	// function with parameter and with return type
	static int Add(int x, int y) {
		return (x + y);
	}

	static int Sub(int x, int y) {
		return (x - y);
	}

	static int Div(int x, int y) {
		return (x / y);
	}
}
