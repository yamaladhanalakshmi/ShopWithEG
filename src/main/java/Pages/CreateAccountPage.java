package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	public WebElement firstNameTextbox;
	
	@FindBy(xpath="//input[@name='lastName']")
	public WebElement lastNameTextbox;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement confirmpasswordTextbox;
	
	@FindBy(xpath="//input[@id=':r7:']")
	public WebElement birthdayTextbox;
	
	@FindBy(xpath="//p[text()='create account']")
	public WebElement createAccountButton;
	

	
	public void enterFirstName()
	{
		firstNameTextbox.sendKeys("Dhana");
    }
	
	
	
	public void enterLastName()
	{
		lastNameTextbox.sendKeys("Lakshmi");
    }
	
	
	
	public void enterEmail()
	{
		emailTextbox.sendKeys("dhanasvp7@gmail.com");
    }
	
	
	
	public void enterPassword()
	{
		passwordTextbox.sendKeys("dhana@123");
    }
	
	
	
	public void enterconfirmPassword()
	{
		confirmpasswordTextbox.sendKeys("dhana@123");
    }
	
	
	
	public void enterBirthday()
	{
		birthdayTextbox.sendKeys("19/11/1993");
    }
	
	
	
	public void clickCreateAccountButton()
	{
		createAccountButton.click();
	}

}
