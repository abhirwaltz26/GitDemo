package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 

{	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']"); 
	By title = By.cssSelector(".text-center>h2"); //div[class='text-center'] h2
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a"); 
	
	public LandingPage(WebDriver driver) 
	
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}

}
