package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name="Abhi";
		e1.age=30;
		e1.setSalary(22.78);
		System.out.println(e1.getSalary());
		e1.setTax(45);
		System.out.println(e1.getTax());
		System.out.println(e1.name+" "+e1.getSalary());
		

	}

}
