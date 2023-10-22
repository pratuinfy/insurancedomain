package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import com.base.baseclass;

public class PIMTest extends baseclass {
	
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

}
