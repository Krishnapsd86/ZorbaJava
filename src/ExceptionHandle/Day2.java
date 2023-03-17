package ExceptionHandle;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[3];
		a[0] = 10;
		a[1] = 23;
		a[2] = 33;

		try {
			for (int i = 0; i < a.length + 1; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		//optional
		finally {
			System.out.println("Final block will run either its have exception or not");
		}
		System.out.println("Continue......");
	}

}
