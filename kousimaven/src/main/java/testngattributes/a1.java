package testngattributes;

import org.testng.annotations.Test;

public class a1 {
	/*
	 * Testng=> Test next generation
	 * testing framewrk
	 * inspired from JUNIT
	 * automatic report generation
	 * annotatons, attributes, parallel, suite....
	 * 
	 * test case
	 *    nonstatic
	 *    @Test
	 *    default order: alphabetical order 
	 ** 
	 *
	 *priority :  run the test case in particular order 
	 *description: add short note on test case 
	 *groups 
	 *invocation count 
	 *disabled/ignore :   enabled=false 
	 *timeout 
	 * */
	
	@Test(priority=0,description="ONE",groups="M",invocationCount=10,enabled=false)
	public void m1()
	{
		System.out.println("Test case 1");
	}
	
	@Test(priority=1,description="TWO",groups="M")
	public void ab()
	{
		System.out.println("Test case 2");
	}
	
	@Test(priority=2,description="THREE",groups="k")
	public void m2()
	{
		System.out.println("Test case 3");
	}

}
