package testNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@AfterTest
	public void AfterTesting()
	
	{
		System.out.println("This is  executed after Testing ");
	}

	@Test(groups= {"Smoke"})
	public void Demo3()
	
	{
		System.out.println("This is Functional3");
	}
	
	
	
}
