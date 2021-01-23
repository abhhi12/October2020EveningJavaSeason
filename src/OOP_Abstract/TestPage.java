package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.url();
		lp.doLogin();
		lp.logo();
		Page.color();
		//top casting: Child class object can be refereed by parent abstract reference variable
		
		Page p = new LoginPage();
		p.title();
		p.header();
		p.timeout();
		
		
		
		
		

	}

}
