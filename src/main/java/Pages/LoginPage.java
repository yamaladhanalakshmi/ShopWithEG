package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailTextbox;
	
	public void enterEmail(String email)
	{
		emailTextbox.sendKeys(email);
    }
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordTextbox;
	
	public void enterpassword(String password)
	{
		passwordTextbox.sendKeys(password);
    }
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signinButton;
	
	public void clickSigninLink()
	{
		signinButton.click();
	}
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement openCreateAccountPage;
	
	public void clickCreateAccountLink()
	{
		openCreateAccountPage.click();
	}
	
	
}