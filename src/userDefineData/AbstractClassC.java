package userDefineData;

public class AbstractClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegPizza vegan = new VegPizza("Vegan",'L');
		vegan.displayPizza();
		vegan.displaySize();

	}

}

abstract class PizzaHut{
	//with constructor
	String type;
	char size;
	public PizzaHut(String type,char size) {
		this.type=type;
		this.size=size;
	}
	//Abstract method --- no body only definition
	abstract public void displayPizza();
	abstract public void displaySize();
}
class VegPizza extends PizzaHut{

	public VegPizza(String type, char size) {
		super(type, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayPizza() {
		// TODO Auto-generated method stub
		System.out.println("Pizza type: "+this.type);
	}

	@Override
	public void displaySize() {
		// TODO Auto-generated method stub
		System.out.println("Size: "+this.size);
	}
	
}