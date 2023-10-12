package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rea {
	ChromeDriver ob;
	@Test(priority=0,description="visiting",groups="K")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//stp2: creating an object for chromedriver class
		 ob= new ChromeDriver();
		//step3: visiting the wbsite
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising",groups="K")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refrshing",invocationCount=3,groups="K")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking",dependsOnGroups="K")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="closing",timeOut=3000,dependsOnGroups="K")
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
