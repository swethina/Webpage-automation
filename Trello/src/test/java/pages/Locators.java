package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Locators {
	@SuppressWarnings("rawtypes")
	public AndroidDriver driver;
	By Login =By.id("com.trello:id/log_in_button");
	By email = By.id("com.trello:id/user");
	By next = By.id("com.trello:id/authenticate");
	By password = By.id("com.trello:id/password");
	By continues = By.xpath("//android.widget.Button[@resource-id='continue']");
	By create = By.id("com.trello:id/add_fab");
	//Create board
	By createboard = By.id("com.trello:id/add_board_fab");
	By boardname = By.id("com.trello:id/board_name");
	By addboard = By.id("com.trello:id/create_board");
	//Add List
	By list = By.id("com.trello:id/add_list_button");
	By listname= By.id("com.trello:id/list_name_edit_text");
	By confirm = By.id("com.trello:id/confirm");
	By addcard = By.id("com.trello:id/add_button");
	By cardName = By.id("com.trello:id/card_name_edit_text");
	public Locators(@SuppressWarnings("rawtypes") AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;;
	}
	public AndroidElement getLogin()
	{
		return (AndroidElement) driver.findElement(Login);
	}
	public AndroidElement getemail()
	{
		return (AndroidElement) driver.findElement(email);
	}
	public AndroidElement getNext()
	{
		return (AndroidElement) driver.findElement(next);
	}
	public AndroidElement getpassword()
	{
		return (AndroidElement) driver.findElement(password);
	}
	public AndroidElement getcontinue()
	{
		return (AndroidElement) driver.findElement(continues);
	}
	public AndroidElement getcreate()
	{
		return (AndroidElement) driver.findElement(create);
	}
	public AndroidElement getcreateboard()
	{
		return (AndroidElement) driver.findElement(createboard);
	}
	public AndroidElement getboardname()
	{
		return (AndroidElement) driver.findElement(boardname);
	}
	public AndroidElement addboard()
	{
		return (AndroidElement) driver.findElement(addboard);
	}
	public AndroidElement addlist()
	{
		return (AndroidElement) driver.findElement(list);
	}
	public AndroidElement enterlistname()
	{
		return (AndroidElement) driver.findElement(listname);
	}
	public AndroidElement confirm()
	{
		return (AndroidElement) driver.findElement(confirm);
	}
	public AndroidElement getcreatecard()
	{
		return (AndroidElement) driver.findElement(addcard);
	}
	public AndroidElement cardname()
	{
		return (AndroidElement) driver.findElement(cardName);
	}
	
}
	
	
	