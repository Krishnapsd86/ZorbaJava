package Two;

import java.util.Arrays;

public class java7 {

	public static void main(String[] args) {

		// initializing a multidimensional array

		// index 0 1 2
		// element value(index) 0 1 2 3 0 1 2 3 0 1 2
		int[][] numbers = { { 11, 22, 33, 88 }, { 44, 55, 66, 77 }, { 99, 22, 55 } };

		System.out.println(numbers[1][2]);
		System.out.println(numbers[0][0]);
		System.out.println(numbers[2][1]);

		int[][] num = new int[3][4];
		num[0][0] = 11;
		num[0][1] = 22;
		num[0][2] = 33;
		num[0][3] = 88;

		num[1][0] = 44;
		num[1][1] = 55;
		num[1][2] = 66;
		num[1][3] = 77;

		num[2][0] = 99;
		num[2][1] = 22;
		num[2][2] = 55;

		System.out.println(num[1][2]);

		int[][] num1 = { { 11, 12, 13, 14, }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } };

		for (int i = 0; i < num1.length; i++) {
			// System.out.println(i);//arrays index will print
			// System.out.println(num1[i]);// print reference of all arrays
			// System.out.println(Arrays.toString(num1[i]));// print all arrays with values
			int rows[] = num1[i];
			for (int b = 0; b < rows.length; b++) {
				System.out.println(rows[b]); // print all value of multidimensional array
			}
		}

		// print all multidimensional array
		int[][] num2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13 } };
		for (int i = 0; i < num2.length; i++) {
			System.out.println(Arrays.toString(num2[i]));
			int ro[] = num2[i];
			for (int b = 0; b < ro.length; b++) {
				System.out.println(ro[b]);
			}
		}

		// multidimensional array with for each

		int[][] numberA = { { 11, 12, 13, 14 }, { 15, 16, 17 }, { 18, 19, 20, 21 } };
		for (int[] r : numberA) {
			// System.out.println(r);// print reference of all arrays
			// System.out.println(Arrays.toString(r));// print all arrays with values
			for (int r1 : r) {
				System.out.println(r1);
			}
		}

		int[][] example = { { 22, 23, 24, 25 }, { 26, 27, 28, 29 }, { 30, 31, 32 } };

		for (int[] example1 : example) {
			System.out.println(Arrays.toString(example1));
			for (int i : example1) {
				System.out.println(i);
			}
		}

		int[][][] num3 = { { { 5, 4, 3 }, { 9, 8, 7, 6 } }, { { 11, 12, 13, 14 }, { 15, 16, 18 } } };

		System.out.println(num3[0][1][0]);
		System.out.println(num3[1][1][1]);
		System.out.println(num3[0][0][2]);

		// Assignment for loop
		int[][] assin = { { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 21, 31, 41 } };
		for (int i = 0; i < assin.length; i++) {
			System.out.println(Arrays.toString(assin[i]));
			int as[] = assin[i];
			for (int b = 0; b < as.length; b++) {
				System.out.println(as[b]);
			}

		}

		// Assignment for each loop
		int[][] assin1 = { { 1, 2, 13, 14 }, { 5, 6, 17, 18 }, { 19, 2, 31, 4 } };
		for (int[] b : assin1) {
			System.out.println(Arrays.toString(b));
			for (int c : b) {
				System.out.println(c);
			}
		}
		String[][] names = new String[2][3];
		names[0][0] = "Hari";
		names[0][1] = "Ram";
		names[0][2] = "Sita";

		names[1][0] = "Bishnu";
		names[1][1] = "Ritu";
		names[1][2] = "Shyam";

		for (String[] name1 : names) {
			System.out.println(Arrays.toString(name1));
		}

	}

}
