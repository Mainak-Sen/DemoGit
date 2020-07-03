package testNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters("Environment")
	@Test
	public void Progression1(String ename)
	
	{
		System.out.println("This is ProgressionTestCase1");
		System.out.println(ename);
	}
	
	@Test(groups= {"Load"})
	public void Progression2()
	
	{
		System.out.println("This is ProgressionTestCase2");
	}
	
	@Test(groups= {"Smoke"})
	public void Progression3()
	
	{
		System.out.println("This is ProgressionTestCase3");
	}

	@AfterTest
	public void AfterProgression()
	
	{
		System.out.println("This is executed after Progression test cases");
	}
}
