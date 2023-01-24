package One;

public class Day3 {

	public static void main(String[] args) {

		// Operator
		// ==(Equal to), !=(not equal), >(greater than), <(Less than)
		// >=(greater than or equal to), <=(less than or equal to)
		Operator(12, 12);
		System.out.println("----------------------------------");
		Operator(100, 15);
		System.out.println("----------------------------------");
		Operator(25, 50);
		System.out.println("----------------------------------");

		// Logical Operator
		// &&(and),||(or),!(not)
		logicOps(11, 11);

	}

	static void Operator(int x, int y) {
		System.out.println(x == y);// equal to
		System.out.println(x != y);// not equal to
		System.out.println(x > y);// greater than
		System.out.println(x < y);// less than
		System.out.println(x >= y);// greater than or equal to
		System.out.println(x <= y);// less than or equal to
	}

	static void logicOps(int a, int b) {
		System.out.println(a == b && b != a);// And
		System.out.println(a == b || b != a);// Or
		System.out.println(!(a != b));// Not
	}

}
