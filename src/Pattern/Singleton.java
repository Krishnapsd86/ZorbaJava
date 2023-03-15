package Pattern;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * illegal construct Compile Time Error: The constructor items() is not visible
		 */
		// items a = new items();
		items.displayItems();

		Single obj = Single.createSingle();
		obj.getSingleCalled();

	}

}

class items {
	static String name;// define parameter as static
	static items it;// instantiated

	private items() {
	}

	public static items displayItems() {
		if (it == null) {
			System.out.println("Its the methods of singleton");// checking its called or not
			it = new items();// instantiated in methods
		}
		return it;
	}
}

class Single {
	// creating object
	private static Single ss = new Single();

	// making constructor private so it will not instantiated
	private Single() {
	}

	// call only the object avaiable
	public static Single createSingle() {
		return ss;
	}

	// methods
	public void getSingleCalled() {
		System.out.println("Methods has detected successfully");
	}

}