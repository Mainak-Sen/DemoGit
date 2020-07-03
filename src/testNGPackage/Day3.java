package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day3 {
	
	@BeforeSuite
	public void Beforesuite()
	
	{
		System.out.println("I will always be number 1");
	}
	@BeforeMethod
	public void Beforeeverymethod()
	
	{
		System.out.println("I will execute before every method in this class");
	}
	@BeforeClass
	public void Beforeclass()
	
	{
		System.out.println("I will execute before any method in this class");
	}
	
	@AfterClass
	public void Afterclass()
	
	{
		System.out.println("I will execute after any method in this class");
	}
	@AfterMethod
	public void Aftereverymethod()
	
	{
		System.out.println("I will execute after every method in this class");
	}

	
	
	@BeforeTest
	public void PrerequisiteRgrsn()
	
	{
		System.out.println("This is Prerequisite for regression testing");
	}

	
	@AfterSuite
	public void Aftersuite()
	
	{
		System.out.println("I will always be executed at the very end ");
	}
	@Test(groups= {"Load"},dependsOnMethods={"Prjct4Regression5"})
	public void Prjct1Regression1()
	
	{
		System.out.println("This is RegressionTestCase1");
	}
	@Parameters("Environment")
	@Test(groups= {"Smoke"})
	public void Prjct1Regression2(String ename)
	
	{
		System.out.println("This is RegressionTestCase2");
		System.out.println(ename);
	}
	
	@Test(dataProvider= "getdata")
	public void Prjct2Regression3(String uname,String pwd)
	
	{
		System.out.println("This is RegressionTestCase3");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@Test(dependsOnMethods={"Prjct1Regression2"})
	public void Prjct3Regression4()
	
	{
		System.out.println("This is RegressionTestCase4");
	}
	
	@Test
	public void Prjct4Regression5()
	
	{
		System.out.println("This is RegressionTestCase5");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		
		//firstset
		data[0][0] = "username1" ;
		data[0][1] = "password1" ;
		
		data[1][0] = "username2" ;
		data[1][1] = "password2" ;
		
		
		data[2][0] = "username3" ;
		data[2][1] = "password3" ;
		
		return data;
		
		
		
	}
}
