package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 * before test :   run only once before all the test cases started its execution
	 * after test :    run only once after all the test cases finished its execution
	 * 
	 * before class: run only once after before test 
	 * after class: run only once, before after test 
	 * 
	 * before method: run before each test case 
	 * aftermethod:   run after each test case 
	 * 
	 * before test: visiting
	 *    before class: max 
	 *        before method : refresh  tc1: title      aftermethod: deleting cookies
	 *        before method : refresh  tc2: clicking   aftermethod: deleting cookies 
	 *   after class: getting ur 
	 * after test : closing
	 * 
	 * 
	 * 
	 * 
	 * */
	
	ChromeDriver ob;
	@Test
	public void t1()
	{
		System.out.println("test case1" + ob.getTitle());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		//stp2: creating an object for chromedriver class
		 ob= new ChromeDriver();
		//step3: visiting the wbsite
		ob.get("http://www.google.com");
		System.out.println("before test ");
	}
	
	
	@AfterTest
	public void at()
	{
		System.out.println("after test ");
		ob.quit();
	}
	
	
	@Test
	public void t2()
	{
		System.out.println("test case 2");
		ob.findElementByLinkText("Images").click();
	}

	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class ");
		ob.manage().window().maximize();
	}
	
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class " + ob.getCurrentUrl());
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method ");
		ob.navigate().refresh();
	}
	
	
	@AfterTest
	public void am()
	{
		System.out.println("after method");
		ob.manage().deleteAllCookies();
	}
}

