package testngattributes;

import org.testng.annotations.Test;

public class a2 {
	
	@Test(timeOut=2000)
	public void t1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi");
	}

}
