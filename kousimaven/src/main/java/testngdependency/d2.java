package testngdependency;

import org.testng.annotations.Test;

public class d2 {
	
	@Test(priority=0,groups="e")
	public void t1()
	{
		System.out.println("t1");
	}
	
	
	@Test(priority=1,groups="e")
	public void t2()
	{
		System.out.println("t2");
	}
	
	
	@Test(priority=3, dependsOnGroups="e")
	public void display()
	{
		System.out.println("display");
	}

}
