package userDefineData;

public class StaticIncrementalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webSite fb = new webSite("Face Book");
		webSite tw = new webSite("Twitter");
		webSite tk = new webSite("TikTok");
		webSite zm = new webSite("Zoom");
		
		System.out.println(webSite.count);
		
		webSite.increaseCount();

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
