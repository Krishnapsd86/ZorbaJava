package Two;

public class Java5 {

	public static void main(String[] args) {

		// Array (objects that hold fix number of values)

		int ary[] = new int[5];
		ary[0] = 99;
		ary[1] = 10;
		ary[2] = 15;
		ary[3] = 20;
		ary[4] = 250;
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		System.out.println(ary[3]);
		System.out.println(ary[4]);

		String name[] = { "Chandra", "Laxman", "Bhim", "Rahul" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(i);// shows the index
			System.out.println(name[i]);
		}
		int arry[] = { 120, 100, 101, 102, 103, 104, 105 };
		for (int j = 0; j < arry.length; j++) {
			// System.out.println(j);
			System.out.println(arry[j] + " -->-index--> " + j);
		}
		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
		for (int c = 0; c < ch.length; c++) {
			// System.out.println(c);
			System.out.println(ch[c] + " index is -- " + c);
		}
		
		//toCharArray (convert given string in sequence of charaters)
		String animal ="Leapord";
		char danger[] = animal.toCharArray();
		for(int i =0;i<danger.length;i++) {
			System.out.println(danger[i]+" convert tochararry--- "+i);			
		}
		
		//split (breaks given string whatever expression is match )
		String str ="I am trying to split string with given expression";
		String spl []=str.split(" ");
		String spli[]=str.split("i");
		for (int i=0;i<spl.length;i++) {
			//System.out.println(i);
			System.out.println(spl[i]+" ---split -- "+i);
		}
		for(int i =0;i<spli.length;i++) {
			//System.out.println(i);
			System.out.println(spli[i]+" --split with 'i' --- "+i);
		}

	}

}
