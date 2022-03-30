package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base

{
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username, String Password, String Text) throws IOException
	{
		driver=initilizeDriver();
		driver.get("http://qaclickacademy.com");
		//one is inheritance
		// creating object to that class and invoke method it
		LandingPage l = new LandingPage(driver);
		l.getLogin().click(); // similar to driver.findElement(By.css()) 
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		System.out.println(Text);
		lp.getLogin().click();
		
	}
	
	@DataProvider
	
	public Object[][] getData()
	{	
		//Row stands for how many different data types test should be run
		//columns stands for how many value for each test
		Object[][] data = new Object[2][3];
		//0th row
		data[0][0] = "nonrestricteduserqa.com";
		data[0][1] = "123456";
		data[0][2] = "restricted user";
		//1st row
		data[1][0] = "restricteduserqa.com";
		data[1][1] = "345678";
		data[1][2] = "non restricted user"; 
		
		return data;
		
		
		
	}
	
	
	
}
