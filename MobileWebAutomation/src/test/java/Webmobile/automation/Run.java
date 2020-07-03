package Webmobile.automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;



public class Run extends basepage {
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException 
	{
	driver = setup();
	Locators r = new Locators(driver);
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse workspace\\MobileWebAutomation\\src\\test\\java\\Webmobile\\automation\\data.properties");
	prop.load(fis);
	String url = prop.getProperty("url");
	driver.get(url);
	Thread.sleep(10);
	String email = prop.getProperty("email");
	Thread.sleep(5);
	r.getemail().sendKeys(email);
	
}
}
