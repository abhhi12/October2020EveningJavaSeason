package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("LoginPage----constructor");
	}
	
	@Override
	public void title() {
		System.out.println("LoginPage----title");
		
	}

	@Override
	public void header() {
		System.out.println("LoginPage----header");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage----url");
		
	}
	
	public void doLogin() {
		System.out.println("LoginPage----dologoin");
	}


}
