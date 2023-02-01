package One;

public class Revision2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		int g = 10;
		int h = 5;
		System.out.println(g < h);
		System.out.println(g > h);
		System.out.println(h == g);
		System.out.println(g <= h);
		System.out.println(g >= h);

		System.out.println("==========================================");
		System.out.println(a == g && b == h);
		System.out.println(h >= a && a <= g);
		System.out.println(b <= a && h == g);
		System.out.println(b >= g || a < h);

		System.out.println("==========================================");
		System.out.println(a == g || b == h);
		System.out.println(h >= a || a <= g);
		System.out.println(b <= a || h == g);
		System.out.println(b >= g || a < h);

		System.out.println("==========================================");
		System.out.println(!(a == g));
		System.out.println(!(g == h));

		System.out.println("==========================================");
		if (a == g && b == h) {
			System.out.println("You should be in");
		}
		if (a >= h || b <= g) {
			System.out.println("You should be out");
		}
		System.out.println("===========================================");
		if (a == g && b == h) {
			System.out.println("You should be in");
		} else if (a >= h || b <= g) {
			System.out.println("You should be out");
		}
		if (a>g) {
			System.out.println("A is greater");
		}
		else {
			System.out.println("G is greater");
			System.out.println("===========================================");
		}
		int day=4;
		switch(day) {
		case 1:
			System.out.println("Day 1");
		case 2:
			System.out.println("Day 2");
		case 3:
			System.out.println("Day 3");
		case 4:
			System.out.println("Day 4");
		default:
			System.out.println("Input valid data");
		
		}
		System.out.println("===========================================");
		switch(day) {
		case 1:
			System.out.println("Day 1");
			break;
		case 2:
			System.out.println("Day 2");
			break;
		case 3:
			System.out.println("Day 3");
			break;
		case 4:
			System.out.println("Day 4");
			break;
		default:
			System.out.println("Input valid data");
		}
		System.out.println("===========================================");
		
		for(int i=10;i<=15;i++) {		
				System.out.println(i);
		}
		System.out.println("===========================================");
		for(int i = 0;i <=3;i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("===========================================");
		for(int i = 10;i>=5;i--) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("===========================================");
		int j=1;
		while(j<=5) {
			System.out.println("HI EVERYONE");
			j++;
		}
		System.out.println("===========================================");
		int k = 5;
		int l =1;
		while(k>=l) {
			System.out.println(k);
			k--;
		}
		System.out.println("===========================================");
		int m =5;
		while(m>=l) {
			System.out.println("Hello");
			if(m==2) {
				break;
			}
			m--;
		}
		
		int n=1;
		while(n<=5) {			
			if(n==2) {
				n++;
				continue;
			}
			System.out.println("Hello Dear");
			n++;
		}
		//Ternary operator
		String result = m>n ? "M is greater" : "N is greater";
		System.out.println(result);
		
		
		par(12, 10);
		withoutpar();
		int f1 = parreturn(12, 2);
		System.out.println(f1);

	}

	public static void par(int c, int d) {
		System.out.println(c + d);
		System.out.println(c - d);
		System.out.println(c * d);
		System.out.println(c / d);
		System.out.println(c % d);
		System.out.println("==========================================");
	}

	public static void withoutpar() {
		System.out.println(10 + 7);
		System.out.println("==========================================");
	}

	static int parreturn(int e, int f) {
		return (e * f);
	}

}
