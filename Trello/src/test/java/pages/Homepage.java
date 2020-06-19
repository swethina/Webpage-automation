package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class Homepage extends base {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test 
	public void basePageNavigation() throws IOException 
	{
	driver = setup();
	Locators s = new Locators(driver);
	//Login
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse workspace\\Trello\\src\\test\\resources\\data.properties");
	prop.load(fis);
	String email=prop.getProperty("email");
	//String password=prop.getProperty("password");
	s.getLogin().click();
	s.getemail().sendKeys(email);
	System.out.println("email entered");
	s.getNext().click();
	//s.getpassword().sendKeys(password);
	//s.getNext().click();
	s.getcontinue().click();
	System.out.println("continue");
	//Create board
	s.getcreate().click();
	s.getcreateboard().click();
	String boardname=prop.getProperty("boardname");
	s.getboardname().sendKeys(boardname);
	s.addboard().click();
	System.out.println("Board created");
	//Create list
	s.addlist().click();
	String listname=prop.getProperty("listname");
	s.enterlistname().sendKeys(listname);
	s.confirm().click();
	System.out.println("List created");
	//Create card
	String cardname=prop.getProperty("cardname");
	s.getcreatecard().click();
	s.cardname().sendKeys(cardname);
	s.confirm().click();
	System.out.println("Card created");
	

}
}

	