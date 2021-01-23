package WebDriveTool;

public class AmazonTest {
	static WebDrive driver;//yaha Parent webdriver ka object reference hai // WebDriver driver comman hai is liye static liya gaya hai. or ye calss name is hi call kiya jaye ga.

	public static void main(String[] args) {
		// Cross browser testing: Chrome , firefox, safari, opera
		
		String browser = "Chrome"; //"Opera"
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();//or yaha child class ka coject hai
		}
		
		else if(browser.equals("FireFox")) {
			driver = new FireFox();
		}
		
		else if(browser.equals("Safari")) {
			driver = new SafariDriver(); 
		}
		
		else {
			System.out.println("No Browser found, please pass the correct browser");
		}
		driver.launchUrl("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.SendKeys("Search text", "mackbook");
		driver.CloseBrowser();

	}

}
