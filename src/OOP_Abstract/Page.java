package OOP_Abstract;

public abstract class Page {
	public Page() {
		System.out.println("Page-----colour");
		//but we can't create the object of constructor in abstract class
	}

	//abstract class: can not create object
	//Abstract class can have abstract methods and non abstract method
	//can have final method 
	//can create the constructor of abstract class
	//partial abstraction
	//We can achieve 0-100% abstraction with abstract class
	//but with interface only 100% abstract is possible
	public abstract void title();
	public abstract void header();
	public abstract void url();
	
	public void timeout() {
		System.out.println("Page----timeout");
	}
	
	public final void logo() {
		System.out.println("Page----logo");
	}
	
	public static void color() {
		System.out.println("Page----color");
	}

}
