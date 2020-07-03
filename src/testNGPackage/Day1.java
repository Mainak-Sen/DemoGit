package testNGPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 extends GlobalEnvVraiblesSetup {
	
	@BeforeClass
    public void Befcls() throws IOException 
	
	{
		System.out.println("I am going to execute before any method in a class ");
		loginsetup();
		
	}
	
	@BeforeTest
	public void BeforeTesting() 
	
	{
		System.out.println("This is a a Prerequisite,just for demo purpose");
		
	}
	
	/*@Parameters("Environment")
	@Test(groups= {"Smoke"})
	public void Demo(String ename)
	
	{
		System.out.println("This is Functional1");
		System.out.println(ename);
	}*/
	
	@Test
	public void Demo2() 
	
	{
		System.out.println("This is Functional2");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void Demo3() 
	
	{
		System.out.println("This is Functional3");
		//Assert.assertTrue(false);
	}

}
