package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglistner.l1.class)
public class a1 {

	@Test
	public void hd()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Images");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}
}


/*assertion: technique where we will be comparing actual result with obtained result
 * 
 * hard
 *     provided by Assert builtin
 *     static in nature
 *     assertion fails=> it will not proceed further
 *      
 * soft 
 *    provided by softassert builtin 
 *    nonstatic in nature
 *    assertion fails=> it will proceed further
 *    original => invoke assertAll()
 * 
 * assertEquals(actual, expected)
 * assertNotEquals(actual, expected)
 * assertTrue(condition)
 * assertFalse(condition)
 * 
 * * 
 */