package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.baseclass;


public class HomePageTest extends baseclass {
	com.pom.LoginPom LoginPom ;
	com.pom.HomePagePom HomepagePom ;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		launchTheWeb();
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	@Test(priority=1)
	public void validate_url() 
	{
		LoginPom = new com.pom.LoginPom();
		HomepagePom = new com.pom.HomePagePom ();
		String actual=HomepagePom.show_url();
		String expected=prop.getProperty("HomeUrl");
		
		Assert.assertEquals(actual, expected);
	
	}
	
	@Test(priority=2)
	public void test() 
	{
		LoginPom = new com.pom.LoginPom();
		HomepagePom = new com.pom.HomePagePom ();
		HomepagePom.click_on_PIM();;
	}

}


