package testnglistner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener=> builtin interface
	//onstart, onfinish, on test success, ontest failure
	//class<=> interface=> class defini=> implements interfacename 
	//rightclick=> source=>  override/implements 
public class l1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
	System.out.println("sucessss!!!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failure!!!!");
	}

	public void onStart(ITestContext context) {
	System.out.println("started @@@@@");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finished |||||");
	}
	
	
	

}
