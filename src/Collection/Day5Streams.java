package Collection;

import java.util.Arrays;
import java.util.List;

public class Day5Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count empty strings
		List<String> strings =Arrays.asList("kln"," ","dfg"," ","abc","","klm");
		System.out.println("List : "+strings);
		long count = getCountEmpty(strings);
		System.out.println("Empty Strings : "+count);
		
		

	}
	private static int getCountEmpty(List<String>strings) {
		int count =0;
		for(String string:strings) {
			if(string.isEmpty()) {
				count++;
			}
		}
		return count;
	}

}

