package WebDriveTool;

public class SafariDriver implements WebDrive {
	
	public SafariDriver() {//constructor
		System.out.println("launch Safari");
	}

	@Override
	public void launchUrl(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:" + element);
		
	}

	@Override
	public void SendKeys(String element, String value) {
		System.out.println("Sending the value in:" +element+ "value" +value);
		
	}

	@Override
	public void CloseBrowser() {
		System.out.println("Close Broewser");
		
	}
	
	

}
