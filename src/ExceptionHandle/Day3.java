package ExceptionHandle;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Exception");

		try {
			int[]a=new int[3];
			a[0]=10;
			a[1]=20;
			System.out.println(a[3]);
			
			System.out.println(20 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block always run");
		}
		System.out.println("Bye Exception");

	}

}
