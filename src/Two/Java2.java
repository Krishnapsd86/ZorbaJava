package Two;

public class Java2 {

	public static void main(String[] args) {

		String game = "Football";
		String game1 = "Volleyball";
		String game2 = "Basketball";
		String game3 = "Football";

		boolean result = game.equals(game2);
		System.out.println(result);

		if (result) {
			System.out.println("Both game are same");
		} else {
			System.out.println("Both game are not same");
		}
		// Ternary operator example
		String result1 = game.equals(game3) ? "Both game are same" : "Both game are not same";
		System.out.println(result1);
		String resultA =game.equals(game1)? "Both game are same" : "Both game are not same";
		System.out.println(resultA);

		// Escaspe character

		String quote = "Best quote\"Try try until you die\"";
		System.out.println(quote);
		
		String says = "Best quote \"Learning never exhausts the mind.\"";
		System.out.println(says);
		
		//startwith/endwith
		String capital ="Kathmandu";
		boolean startwith =capital.startsWith("K");
		boolean sw =capital.startsWith("k");//case sensitive
		System.out.println(startwith);
		System.out.println(sw);
		
		boolean endwith =capital.endsWith("u");
		boolean ew = capital.endsWith("A");
		System.out.println(endwith);
		System.out.println(ew);
		
		//contains / replace  / replaceAll /replace First
		String sen ="I am new in programming fields and new in IT industry";
		boolean contain = sen.contains("new");
		System.out.println(contain);
		
		String rep = sen.replace("n", "m");
		System.out.println(rep);
		
		String rep1 = sen.replaceAll("new", "old");
		System.out.println(rep1);
		
		String rep2 =sen.replaceFirst("new", "old");
		System.out.println(rep2);
		
		String city6 = "chandragadi";
		// index starts from zero example
		// 0   1   2   3   4   5   6   7   8  9  10
		// c   h   a   n   d   r   a   g   a  d  i
		char a = city6.charAt(7);
		System.out.println(a);	 // d	
		System.out.println(city6.length());
		
		String month ="February";
		char b = month.charAt(5);
		System.out.println(b);
		System.out.println(month.length());
		
		int len =city6.length();
		System.out.println(len);
		
		String rev="";
		char ch;
		for(int i =0;i<len;i++) {
			ch=city6.charAt(i);
			rev =ch + rev;
		}
		System.out.println(rev);

	}

}
