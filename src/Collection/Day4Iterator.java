package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Day4Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Nissan");
		cars.add("Honda");
		cars.add("Mazda");

		Iterator<String> it = cars.iterator();

		System.out.println(it.next());

		// looping to collection
		while (it.hasNext()) {
			System.out.println(it.next());

			ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(10);
			numbers.add(8);
			numbers.add(5);
			numbers.add(18);

			Iterator<Integer> num = numbers.iterator();

			while (num.hasNext()) {
				Integer i = num.next();
				if (i < 10) {
					num.remove();
				}

			}
			System.out.println(numbers);
		}
	}

}
