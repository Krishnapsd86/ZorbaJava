package userDefineData;

public class nestedInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Devices apple = new Devices();
		apple.name="Iphone";
		Devices.Iphone a =apple.new Iphone();
		a.display();
		Devices.Android an=new Devices.Android();
		an.display();

	}

}
class Devices{
	String name;
	class Iphone{
		public void display() {
			System.out.println("Iphone List");
		}
	}
	static class Android{
		public void display() {
			System.out.println("Android List");
		}
	}
}