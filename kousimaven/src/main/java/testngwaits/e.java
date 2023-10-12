package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class e {
	/*
	 * 
	 * create an object for webdriverwat class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 * 
	 * 
	 * * 
	 * code is correct: within the time limit, it will proceed further , will not wait for completion of time limit
	 * code is wrong: it will wait for the completion of time limit, then it throws error
	 * 
	 * 
	 * */
	@Test
	public void im()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	WebDriverWait w= new WebDriverWait(ob,5);
	
	//title
	//w.until(ExpectedConditions.titleIs("Googjkjkle"));
	//w.until(ExpectedConditions.titleContains("oo"));
	
	// alert is present 
	//w.until(ExpectedConditions.alertIsPresent());
	
	//visibility of element
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
	
	//visibility of more elements
	//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	
	//clickable or not
	w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
	
	ob.quit();
	
	}

}
