package userDefineData;

public class StaticIncrementalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webSite fb = new webSite("Face Book");
		webSite tw = new webSite("Twitter");
		webSite tk = new webSite("TikTok");
		webSite zm = new webSite("Zoom");
		webSite tk1 = new webSite("TikTok1");
		webSite zm1 = new webSite("Zoom1");
		System.out.println(webSite.count);	
		webSite.increaseCount();
		
		Plant r = new Plant("Rose");
		Plant r1 = new Plant("Rose1");
		Plant r2 = new Plant("Rose2");
		Plant r3= new Plant("Rose3");
		System.out.println(Plant.count);
		

	}

}
class webSite{
	static int count = 0;
	String name;
	public webSite(String name){
		this.name=name;
		
		webSite.increaseCount();
		//webSite.count =webSite.count +1;
	}
	public void displayWeb() {
		System.out.println(this.name);
		
	}
	
	public static void increaseCount() {
		webSite.count =webSite.count +1;
	}
//	public void displayWebName() {
//		System.out.println(webSite.count);
//	}
	
}
class Plant {
	static int count =0;
	String pName;
	Plant(String pName){
		this.pName = pName;
		
		//Plant.count = Plant.count+1;
		Plant.increaseCount();
		
	}
	void displayP() {
		System.out.println(this.pName);
	}
	public static void increaseCount() {
		Plant.count=Plant.count +1;
	}
}







