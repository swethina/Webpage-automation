package Webmobile.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
	public class Locators {
		@SuppressWarnings("rawtypes")
		public AndroidDriver driver;
		By email = By.xpath("//*[@id=\"user\"]");
	
		
		public Locators(@SuppressWarnings("rawtypes") AndroidDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		public AndroidElement getemail()
		{
			return (AndroidElement) driver.findElement(email);
		}
	}
	
		