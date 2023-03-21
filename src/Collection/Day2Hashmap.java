package Collection;

import java.util.HashMap;

public class Day2Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap is key type
		HashMap<String,String> CapitalCities = new HashMap<String,String>();
		
		//Add
		CapitalCities.put("KTM", "Kritipur");
		CapitalCities.put("MNNP", "Birtamod");
		CapitalCities.put("KNNP", "Morang");
		CapitalCities.put("JNNP", "Janakpur");
		CapitalCities.put("ILM", "Kanyam");
		
		System.out.println(CapitalCities);
		
		//Retrive
		System.out.println(CapitalCities.get("KTM"));
		System.out.println(CapitalCities.get("MNNP"));
		System.out.println(CapitalCities.get("KNNP"));
		System.out.println(CapitalCities.get("JNNP"));
		System.out.println(CapitalCities.get("ILM"));
		
		//update
		CapitalCities.put("JNNP", "Janak Dham");
		System.out.println(CapitalCities);
		
		//delete
		CapitalCities.remove("JNNP");
		System.out.println(CapitalCities);
		
//		CapitalCities.clear();
//		System.out.println(CapitalCities.size());
		
		System.out.println(CapitalCities.keySet());//display key
		System.out.println(CapitalCities.values());//display value
		
		//loop
		for (String key : CapitalCities.keySet()) {
			System.out.println(key);
		}
		for (String val : CapitalCities.values()) {
			System.out.println(val);
		}
		for (String key : CapitalCities.keySet()) {
			System.out.println(key +" "+CapitalCities.get(key));
			
		}
		System.out.println("*******************************************************************");
		// define a hashmap with interger , string
		// selenium project
		
		HashMap<Integer, String> IdList = new HashMap<Integer,String>();
		
		//Add
		IdList.put(01, "Books");
		IdList.put(02, "Copies");
		IdList.put(03, "Pencils");
		IdList.put(04, "Pens");
		IdList.put(05, "Bag");
		System.out.println(IdList);
		
		//Retirve
		System.out.println(IdList.get(01));
		System.out.println(IdList.get(02));
		System.out.println(IdList.get(03));
		System.out.println(IdList.get(04));
		System.out.println(IdList.get(05));
		
		//update
		IdList.put(01, "Stories");
		System.out.println(IdList);
		
		//delete
		IdList.remove(01);
		System.out.println(IdList);
		System.out.println(IdList.size());
		
		System.out.println(IdList.keySet());
		System.out.println(IdList.values());
		
		//loop
		for (Integer key : IdList.keySet()) {
			System.out.println(key);
		}
		for (String val : IdList.values()) {
			System.out.println(val);
		}
		for (Integer key : IdList.keySet()) {
			System.out.println(key +" "+IdList.get(key));
		}
		

	}

}
