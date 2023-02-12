package Two;

public class Java6 {

	public static void main(String[] args) {
		
		//sum and average
		int num[]= {12,24,36,48,60,72,84,96,108,120};
		int sum = 0;
		float avrg = 0;
		//for each loop
		for(int a:num) {
			sum = sum + a;
		}
		System.out.println(sum);
		avrg =sum/num.length;
		System.out.println(avrg);
		
		int num1[]= {11,22,33,44,55,66,77,88,99};
		int sum1=0;
		int aver =0;
		for(int b:num1) {
			sum1 =sum1 + b;
		}
		System.out.println(sum1);
		aver = sum/num1.length;
		System.out.println(aver);
		
		//defining two matrix array
		
		int [][]matrix ={{11,22,33,44},{12,24,36,48,60}};
		System.out.println(matrix[0][3]);
		System.out.println(matrix[1][4]);

	}

}
