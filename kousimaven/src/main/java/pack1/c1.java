package pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//stp2: creating an object for chromedriver class
		ChromeDriver ob= new ChromeDriver();
		//step3: visiting the wbsite
		ob.get("http://www.google.com");
	}
}
