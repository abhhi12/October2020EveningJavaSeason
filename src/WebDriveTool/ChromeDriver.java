package WebDriveTool;

public class ChromeDriver implements WebDrive {

	public ChromeDriver() {//constructor
		System.out.println("Launch google chrome");
	}

	@Override
	public void launchUrl(String url) {
		System.out.println("Launching url:" +url);
		
	}

	@Override
	public String getTitle() {
		String title = "Some title";
		return title;
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:" + element);
		
	}

	@Override
	public void SendKeys(String element, String value) {
		System.out.println("Sending the value in:" +element+ " value " +value);
		
	}

	@Override
	public void CloseBrowser() {
		System.out.println("Close Broewser");
		
	}
	
	
}
