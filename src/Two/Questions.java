package Two;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Krishna",rev="";
		char ch;
		for(int i = name.length()-1;i>=0;i--) {
			ch =name.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		
		String name1 = name.replace("a", "i");
		System.out.println(name1);
	}

}
