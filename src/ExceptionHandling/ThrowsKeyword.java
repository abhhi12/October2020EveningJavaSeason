package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() throws ArithmeticException {//yaha pata hai kon sa exception hai is liye direct exception name likh diya gaya hai
		m2();
	}

	public void m2() throws ArithmeticException {
		m3();
	}

	public void m3() throws ArithmeticException {

		try {
			int i = 9 / 0;
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException is coming...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();

		obj.m1();

	}

}
