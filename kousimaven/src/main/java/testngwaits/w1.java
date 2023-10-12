package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class w1 {
	/*
	 * conditional           - explicit wait  
	 * unconditional         -implicit wait
	 * 
	 * implicit wait: once it is declared all the code 
	 * 
	 * 
	 * code is correct: within the time limit, it will proceed further , will not wait for completion of time limit
	 * code is wrong: it will wait for the completion of time limit, then it throws error
	 * * 
	 * */
	@Test
	public void im()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	//stp2: creating an object for chromedriver class
	 ChromeDriver ob = new ChromeDriver();
	//step3: visiting the wbsite
	ob.get("http://www.google.com");
	ob.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println(ob.getTitle());//5
	System.out.println(ob.getCurrentUrl());//5
	ob.navigate().refresh();//5
	ob.findElementByLinkText("muthu"); //5
	ob.quit();//5
	}

}

