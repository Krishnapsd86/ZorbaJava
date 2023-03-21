package Collection;

import java.util.ArrayList;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection 
		
		//ArrayList
		//Hashmap
		//Linked List
		//HashSet
		//WrapperClasses
		
		// Array is fixed length
		// ArrayList you can modify the size
		// Object will have properties and methods
		
		ArrayList<String> Cars = new ArrayList<String>();
		
		//add
		Cars.add("Porche");
		Cars.add("Nissan");
		Cars.add("BMW");
		Cars.add("Honda");
		Cars.add("Kia");
		
		//Retrive
		String my = Cars.get(0);
		System.out.println(my);
		
		//update
		Cars.set(2, "Mercede");
		System.out.println(Cars.get(2));
		
		//delete
		Cars.remove(2);
		System.out.println(Cars.get(2));
		
		//Cars.clear();
		//clear() clear the arrayList temporary
		
		//size() of arrayList
		System.out.println(Cars.size());
		System.out.println(Cars);
		
		//for loop
	   for (int i = 0; i < Cars.size(); i++) {
		System.out.println(Cars.get(i));
	}
	   //for each
	   for (String car : Cars) {
		System.out.println(car);
	}
		
		

	}

}
