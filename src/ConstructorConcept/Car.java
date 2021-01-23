package ConstructorConcept;

public class Car {

	String name;
	int price;
	String color;
	double mileage;

	public Car(String name, int price, String color, double mileage) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.mileage = mileage;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Car(String name, int price, double mileage) {
		super();
		this.name = name;
		this.price = price;
		this.mileage = mileage;
	}
		
		public static void main(String[] args) {

			Car c1 = new Car("Alto", 3);
			Car c2 = new Car("BMW", 70, "Blue", 12.33);
			Car c3 = new Car("Audi", 80, "Red");

			System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.mileage);

			System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.mileage);

			
		}

	}
	
