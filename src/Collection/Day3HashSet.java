package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Day3HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet set the values [no duplicates values are allowed]
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ganesh");
		hs.add("Shiva");
		hs.add("Hari");
		hs.add("Narayan");
		hs.add("Laxmi");
		hs.add("Hanuman");
		System.out.println(hs);
		
		hs.remove("Narayan");
		System.out.println(hs);
		
		boolean li =hs.contains("Laxmi");
		System.out.println(li);
		boolean fi =hs.contains("Narayan");
		System.out.println(fi);
		
//		hs.clear();
//		System.out.println(hs);
		
		System.out.println(hs.size());
		
		for(String h:hs) {
			System.out.println(h);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hari");
		al.add("Hanuman");
		al.add("Narayan");
		
		for(int i = 0;i<al.size();i++) {
			if(hs.contains(al.get(i))) {
				System.out.println(al.get(i)+" "+ "match the element");
				
			}
			else {
				System.out.println(al.get(i)+" "+"Does Not match");
			}
		}

	}

}
