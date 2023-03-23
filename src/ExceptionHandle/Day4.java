package ExceptionHandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Day4 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();// Print all exception type
			System.out.println(e.getMessage());// print exception reason
			System.out.println(e.toString());// print exception in String
			System.out.println("Please correct input");
		}
		System.out.println("Hello");

		
		String firstName=null;
		try {
			
			System.out.println(firstName.charAt(0));
			System.out.println(firstName);
		} catch (NullPointerException e) {
			System.out.println("Initialize Value.....???");
		} catch (Exception e) {
			System.out.println("Exception handle");
		} finally {
			
			System.out.println("Finally will be executate");
		}
		
		int []count =new int[4];
		count[0]=10;
		count[1]=20;
		count[2]=30;
		
		try {
			System.out.println(count[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		//file exception handling
	
		try {
			File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.close();
		} catch (Exception e) {
			System.out.println("File not Found");
			e.printStackTrace();
			System.out.println("Please provide correct path");
		}
		System.out.println("Bye");


	}

}
