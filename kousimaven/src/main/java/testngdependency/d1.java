package testngdependency;

import org.testng.annotations.Test;

public class d1 {

	//dependsonMethods : create connection between test case 
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting");
	}
	
	
	@Test(priority=1, dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("login");
	}
	
	//visiting: pass     lg: pass
	// visiting: fail    lg: skipped
}
