package Academy;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.base;

public class ValidateNavigationBar extends base

{
	@Test
	
	public void basePageNavigation() throws IOException
	{
		driver=initilizeDriver();
		driver.get("http://qaclickacademy.com");
		//driver.get(prop.getProperty("url"));
		//one is inheritance
		// creating object to that class and invoke method it
		LandingPage l = new LandingPage(driver);
		// print only give text - Requirement here as compare here the text from the browser with actual value.mismatch-fail
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		//Assert.assertFalse(false);
		
		
		
	}
	
}
