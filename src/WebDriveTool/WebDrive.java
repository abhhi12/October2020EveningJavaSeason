package WebDriveTool;

public interface WebDrive {//public interface kar sakta hai webdriver se
	
	public void launchUrl(String url);//these are abstract methods(a set of rules to be implemented by  child class through override method))
	public String getTitle();
	public void click(String element);
	public void SendKeys(String element, String value);
	public void CloseBrowser();
	
	
	

}
