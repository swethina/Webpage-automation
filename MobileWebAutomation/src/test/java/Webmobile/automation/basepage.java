package Webmobile.automation;
import java.io.File;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class basepage {
	//AndroidDriver<MobileElement> driver;
	AppiumDriver<MobileElement> driver = null;

@Test

	public AppiumDriver<MobileElement> setup() throws MalformedURLException, InterruptedException
	{
	try{
	
	DesiredCapabilities caps = new DesiredCapabilities();
	//caps.setCapability("deviceName", "Pixel_3a_XL_API_27");
	caps.setCapability("deviceName", "Le Max2");
	caps.setCapability("platformVersion", "6.0.1");
	caps.setCapability("udid", "1ece6047");
	caps.setCapability("platformName", "Android");
	caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	//caps.setCapability("udid", "emulator-5554");
	//caps.setCapability("platformVersion", "8.1.0");
	caps.setCapability("noReset", true);
	caps.setCapability( "automationName", "UiAutomator1");
	//caps.setCapability("appPackage","com.android.chrome");
	//caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	caps.setCapability("–session-override",true);
	caps.setCapability("skipServerInstallation",true);
	//caps.setCapability("adbExecTimeout",9000);
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver.get("https://trello.com/login");
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	driver.findElementByXPath("//input[@id='login']").click();
	//Thread.sleep(100);
	System.out.println("Application started");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getCause());
		System.out.println(e.getMessage());
		
	}
	return driver;

	
	}

	
}



