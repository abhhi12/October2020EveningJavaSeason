package OOP_Encapsulation;

public class Employee {
	public String name;
	public int age;
	private double salary;
	private int tax;
	
	
	

	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public int getTax() {
		return tax;
	}




	public void setTax(int tax) {
		this.tax = tax;
	}




	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name="Tom";
		obj.age=26;
		obj.tax=20;
		obj.salary=22.33;
		obj.setSalary(8999);
		System.out.println(obj.name);
		System.out.println(obj.salary);

	}

}
