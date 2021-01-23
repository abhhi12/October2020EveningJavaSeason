package OOP_Encapsulation;

public class TestLogin {

	public static void main(String[] args) {
		login lg = new login();
		
		lg.setPassword("abc123");
		lg.setUsername("RamSeller");
		lg.doLogin(lg.getUsername(), lg.getPassword());
		
		lg.setPassword("Seller@gmail.com");
		lg.setUsername("Seller@123");
		lg.doLogin(lg.getUsername(), lg.getPassword());
		
		
	}

}
