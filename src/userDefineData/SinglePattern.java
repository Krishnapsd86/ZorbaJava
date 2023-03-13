package userDefineData;

public class SinglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Form.createInstance();
		Form.createInstance();
		Form.createInstance();

	}

}
class Form{
	static String type;
	static Form f1;
	private Form() {
		
	}
	public static Form createInstance() {
		if(f1==null) {
			System.out.println("Hello");
			f1= new Form();
		}
		return f1;
	}

	
}
