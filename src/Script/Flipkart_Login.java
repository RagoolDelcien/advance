package Script;

import java.awt.AWTException;

import generic.Before_Methods;

import org.testng.annotations.Test;

import POM.Home_Page;
import POM.Login_Page;
import POM.Product_Page;



public class Flipkart_Login extends Before_Methods {

	
	@Test
	public void testFlipkart_Login() throws AWTException, InterruptedException
	{
		
		driver.get("https://www.flipkart.com");
		
		Login_Page lp=new Login_Page(driver);
		lp.setUsername("ragooldelcien@gmail.com");
		lp.setPassword("delcien24");
		lp.Login();
		driver.manage().window().maximize();
		lp.verify_title(driver.getTitle());
		Home_Page hp=new Home_Page(driver);
		hp.SearchForProduct("mobile");
		Product_Page p1=new Product_Page(driver);
		p1.sortBrands("Fogg");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
