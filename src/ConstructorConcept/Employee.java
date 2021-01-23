package ConstructorConcept;

public class Employee {


		String name;
		int id;
		int age;
		boolean isActive;


		public Employee() {
			System.out.println("0 param const...");
		}

		public Employee(int a) {
			System.out.println("1 param const..." + a);
		}

		public Employee(int a, String b) {
			System.out.println("2 param const..." + a + b);
		}

		public Employee(String name, int id) {
			this.name = name;
			this.id = id;
		}

		public Employee(String name, int age, int id) {
			this.name = name;
			this.age = age;
			this.id = id;
		}

		public Employee(String name, int id, int age, boolean isActive) {
			this.name = name;
			this.id = id;
			this.age = age;
			this.isActive = isActive;
		}

		public static void main(String[] args) {

			Employee obj = new Employee(10, "Java");

			Employee e1 = new Employee("Tom", 101);
			System.out.println(e1.name + " " + e1.id + " " + e1.age + " " + e1.isActive);

			Employee e2 = new Employee("Peter", 102, 30, true);
			System.out.println(e2.name + " " + e2.id + " " + e2.age + " " + e2.isActive);

		}



	}

